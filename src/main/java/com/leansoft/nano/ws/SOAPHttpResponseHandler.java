package com.leansoft.nano.ws;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

import android.os.Message;

import com.leansoft.nano.ws.SoapQueryHandler;
import com.leansoft.nano.Format;
import com.leansoft.nano.exception.UnmarshallException;
import com.leansoft.nano.impl.SOAPReader;
import com.leansoft.nano.impl.XmlSAXReader;
import com.leansoft.nano.log.ALog;
import com.leansoft.nano.util.MapPrettyPrinter;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.util.HashMap;

public class SOAPHttpResponseHandler extends AsyncHttpResponseHandler {
	
	private static final String TAG = SOAPHttpResponseHandler.class.getSimpleName();
	
    protected static final int SUCCESS_RESPONSE_HANDLING_MESSAGE = 100;
	
	@SuppressWarnings("rawtypes")
	private SOAPServiceCallback callback;
	private Class<?> bindClazz;
	private SOAPVersion soapVersion;
	private String charset;
	private boolean debug;
   private SoapQueryHandler soapHandler;
	
	@SuppressWarnings("rawtypes")
	public SOAPHttpResponseHandler(SoapQueryHandler soapHandler, SOAPServiceCallback callback, Class<?> bindClazz, SOAPVersion soapVersion) {
		super();
		this.callback = callback;
		this.bindClazz = bindClazz;
		this.soapVersion = soapVersion;
      this.soapHandler = soapHandler;
	}
	
	@Override
    public void onFailure(Throwable error, String content) {
        this.callback.onFailure(error, content);
    }
	
	
//	@Override
    protected void sendSuccessMessage(int statusCode, Header[] headers, InputStream responseBody) {
		try {
			// unmarshalling
			Object responseObject = this.convertSOAPToObject(responseBody);
			if (responseObject != null) {
		        sendMessage(obtainMessage(SUCCESS_RESPONSE_HANDLING_MESSAGE, new Object[]{responseObject}));
			} else {
				throw new UnmarshallException("Fail to convert SOAP response to object of type :" + bindClazz.getName());
			}
			
		} catch (UnmarshallException e) {
			ALog.e(TAG, "Response unmarshalling exception", e);
			sendFailureMessage(e, "Response unmarshalling exception", responseBody);
		}
    }
	
    protected void sendFailureMessage(Throwable e, String errorMessage, InputStream responseBody) {
    	if (e instanceof HttpResponseException) {
    		HttpResponseException httpResponseException = (HttpResponseException)e;
    		if (httpResponseException.getStatusCode() >= 300 && responseBody != null) {// may be still a successful response
    			try {
					Object responseObject = this.convertSOAPToObject(responseBody);
					if (responseObject != null) {
				        sendMessage(obtainMessage(SUCCESS_RESPONSE_HANDLING_MESSAGE, new Object[]{responseObject}));
				        return;
					}
				} catch (UnmarshallException e1) {
					// ignore
				}
    		}
    	}
        
    	sendMessage(obtainMessage(FAILURE_MESSAGE, new Object[]{e, errorMessage}));
    }
    
    private StringBuilder streamToString(InputStream is) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        int read = 0;
        byte [] buffer = new byte[16384];
        while ( (read = is.read(buffer)) > 0)
        {
           sb.append( new String(buffer, 0, read, "UTF-8"));
        }
        buffer = null;
        return sb;
    }
    
	private Object convertSOAPToObject(InputStream responseContent) throws UnmarshallException {
		
		try {
			Format format = new Format(true, charset);
         
         XmlSAXReader soapReader = new XmlSAXReader(format, bindClazz);
			if (soapVersion == SOAPVersion.SOAP11) {
				com.leansoft.nano.soap11.Envelope envelope = soapReader.read(com.leansoft.nano.soap11.Envelope.class, responseContent);
            
				if (envelope != null && envelope.body != null && envelope.body.any != null && envelope.body.any.size() > 0) {
					return envelope.body.any.get(0);
				}
				
			} else {
				com.leansoft.nano.soap12.Envelope envelope = soapReader.read(com.leansoft.nano.soap12.Envelope.class, responseContent);
				if (envelope != null && envelope.body != null && envelope.body.any != null && envelope.body.any.size() > 0) {
					return envelope.body.any.get(0);
				}
            return null;
			}
		
		} catch (Exception e) {
			throw new UnmarshallException("Fail to convert SOAP response to object of type :" + bindClazz.getName(), e);
		}
		
		return null;
	}
	
    @SuppressWarnings("unchecked")
	protected void handleSuccessResponse(Object responseObject) {
    	
    	if (responseObject instanceof com.leansoft.nano.soap11.Fault || responseObject instanceof com.leansoft.nano.soap12.Fault) {
    		callback.onSOAPFault(responseObject);
    	} else {
    		callback.onSuccess(responseObject);
    	}
    	
    }
	
    // Methods which emulate android's Handler and Message methods
    protected void handleMessage(Message msg) {
        Object[] response;

        switch(msg.what) {
            case SUCCESS_RESPONSE_HANDLING_MESSAGE:
                response = (Object[])msg.obj;
                handleSuccessResponse(response[0]);
                break;
            case FAILURE_MESSAGE:
                response = (Object[])msg.obj;
                handleFailureMessage((Throwable)response[0], (String)response[1]);
                break;
        }
    }
    
    // Interface to AsyncHttpRequest
    protected void sendResponseMessage(HttpResponse response) {
        StatusLine status = response.getStatusLine();
        InputStream responseBody = null;
        try {
            HttpEntity temp = response.getEntity();
            if(temp != null) {
                /*InputStream is = temp.getContent();
                StringBuilder bd = streamToString(is);
                responseBody = bd.toString();
                bd = null;
                //HINT!
                Runtime.getRuntime().gc();*/
                responseBody = temp.getContent();
            }
        } catch(IOException e) {
            sendFailureMessage(e, "error to get response body", responseBody);
            ALog.e(TAG, "error to get response body", e);
            return;
        }
      if (soapHandler != null)
      {
//         soapHandler.handleResponse(status.getStatusCode(), MapPrettyPrinter.printMap(this.getHeaderMap(response)), responseBody);
      }
		if (debug) {
			ALog.d(TAG, "Response HTTP status : " + status.getStatusCode());
			Map<String, String> headerMap = this.getHeaderMap(response);
			String headers = MapPrettyPrinter.printMap(headerMap);
			ALog.d(TAG, "Response HTTP headers : ");
			ALog.d(TAG, headers);
			ALog.d(TAG, "Response message : ");
			//ALog.debugLongMessage(TAG, responseBody);
		}

        if(status.getStatusCode() >= 300) {
            sendFailureMessage(new HttpResponseException(status.getStatusCode(), status.getReasonPhrase()), "http response exception", responseBody);
        } else {
            sendSuccessMessage(status.getStatusCode(), response.getAllHeaders(), responseBody);
        }
    }
    
    private Map<String, String> getHeaderMap(HttpResponse response) {
    	Map<String, String> headerMap = new HashMap<String, String>();
    	Header[] headers = response.getAllHeaders();
    	if (headers != null && headers.length > 0) {
    		for(Header header : headers) {
    			headerMap.put(header.getName(), header.getValue());
    		}
    	}
    	return headerMap;
    }

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}
}
