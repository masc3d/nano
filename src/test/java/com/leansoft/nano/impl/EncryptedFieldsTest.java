package com.leansoft.nano.impl;

import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;


import com.leansoft.nano.annotation.Attribute;
import com.leansoft.nano.annotation.Element;
import com.leansoft.nano.annotation.Order;
import com.leansoft.nano.annotation.Value;
import com.leansoft.nano.exception.MappingException;
import com.leansoft.nano.exception.ReaderException;
import com.leansoft.nano.exception.WriterException;
import com.leansoft.nano.transform.StringTransform;
import com.leansoft.nano.util.Base64;

import junit.framework.TestCase;

public class EncryptedFieldsTest extends TestCase 
{

  private static class CommentItemType implements Serializable 
  {
     
     private static final long serialVersionUID = -1L;
     @Value(encrypted = true)
     @Order(value=0)
     public String value; 
     
     @Attribute(name = "OverrideMode")
     @Order(value=1)
     public boolean overrideMode; 
     
     @Attribute  
     @Order(value=2)
     public String date;  
     
     @Attribute  
     @Order(value=3)
     public String time;  
     
     @Attribute  
     @Order(value=4)
     public String tech;  
     
     @Attribute  
     @Order(value=5)
     public Boolean hidden;  
   }
   //@RootElement(name="pat")
   private static class Patient 
   {
      // no annotation
      public String id;

      @com.leansoft.nano.annotation.Element
      public CommentItemType tubeComment;
   
      @Element(encrypted = true)
      public String name;
      
      @Element(name="description")
      public String desc;
   }

   // secret AES 128 bit key
   private static final byte[] raw = {17, -21, -7, 82, 4, -59, -19, 99, -3, -81, 1, -78, 120, -14, -64, 7};


  private final class FieldFilter extends StringTransform
  {
     private Cipher _do;
     private Cipher _undo;
     public FieldFilter()
     {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        try
        {
           _do = Cipher.getInstance("AES");
           _do.init(Cipher.ENCRYPT_MODE, skeySpec);
           _undo = Cipher.getInstance("AES");
           _undo.init(Cipher.DECRYPT_MODE, skeySpec);
        }
        catch (InvalidKeyException ex) {
           //LOG.error("Invalid key", ex);
        } catch (NoSuchAlgorithmException ex) {
           //LOG.error("No such algorithm", ex);
        } catch (NoSuchPaddingException ex) {
           //LOG.error("No such padding exception", ex);
        }
     }
     @Override
     public String read(String value) throws Exception 
     {
        try
        {
           byte[] decodedValue = Base64.decode(value);
           byte[] decValue = _undo.doFinal(decodedValue);
           return new String(decValue);
        } catch (IllegalBlockSizeException ex) 
        {
           //LOG.error("Illegal block size", ex);
        } catch (BadPaddingException ex) 
        {
           //LOG.error("Bad Padding Exception", ex);
        }
        return "";
     }
     @Override 
     public String write(String value) throws Exception 
     {
        return Base64.encode(_do.doFinal(value.getBytes()));
     }

  };

   
   public void testEncryption()
   {
      Patient pat = new  Patient();
      pat.id = "id";
      pat.name = "John Doe";
      pat.desc = "description";
      pat.tubeComment = new CommentItemType();
      pat.tubeComment.value = "some comment";
      pat.tubeComment.tech = "SCC";
      pat.tubeComment.time = "2015-11-22T12:33";
      XmlPullWriter writer = new XmlPullWriter(new FieldFilter());
      try
      {
         String str = writer.write(pat);
         String expected = 
               "<?xml version=\"1.0\" encoding=\"utf-8\"?><patient>\n" + 
               "    <description>description</description>\n" + 
               "    <name>p7eSFPR7INPAI2DzP/oOQQ==</name>\n" + 
               "    <tubeComment OverrideMode=\"false\" time=\"2015-11-22T12:33\" tech=\"SCC\">DVZvgxWf4nR3FLn9EH+UYw==</tubeComment>\n" + 
               "</patient>";
         assertEquals(expected, str);
      }
      catch (WriterException e)
      {
         e.printStackTrace();
      }
      catch (MappingException e)
      {
         e.printStackTrace();
      }
   }

   public void testNoEncryption()
   {
      Patient pat = new  Patient();
      pat.id = "id";
      pat.name = "John Doe";
      pat.desc = "description";
      pat.tubeComment = new CommentItemType();
      pat.tubeComment.value = "some comment";
      pat.tubeComment.tech = "SCC";
      pat.tubeComment.time = "2015-11-22T12:33";
      XmlPullWriter writer = new XmlPullWriter();
      try
      {
         String str = writer.write(pat);
         String expected = 
               "<?xml version=\"1.0\" encoding=\"utf-8\"?><patient>\n" + 
               "    <description>description</description>\n" + 
               "    <name>John Doe</name>\n" + 
               "    <tubeComment OverrideMode=\"false\" time=\"2015-11-22T12:33\" tech=\"SCC\">some comment</tubeComment>\n" + 
               "</patient>";
         assertEquals(expected, str);
      }
      catch (WriterException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (MappingException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public void testDecryption() throws ReaderException, MappingException
   {
      String inputXml= 
            "<?xml version=\"1.0\" encoding=\"utf-8\"?><patient>\n" + 
            "    <description>description</description>\n" + 
            "    <name>p7eSFPR7INPAI2DzP/oOQQ==</name>\n" + 
            "    <tubeComment OverrideMode=\"false\" time=\"2015-11-22T12:33\" tech=\"SCC\">DVZvgxWf4nR3FLn9EH+UYw==</tubeComment>\n" + 
            "</patient>";
      XmlSAXReader reader = new XmlSAXReader(new FieldFilter());
      Patient pat;
      try
      {
         pat = (Patient)reader.read(Patient.class, inputXml);
         assertEquals("John Doe", pat.name);
         assertEquals("description", pat.desc);
         assertEquals("some comment", pat.tubeComment.value);
         assertEquals("SCC", pat.tubeComment.tech);
         assertEquals("2015-11-22T12:33", pat.tubeComment.time);
         assertNull(pat.id);
      }
      catch (ReaderException e1)
      {
         e1.printStackTrace();
         throw e1;
      }
      catch (MappingException e1)
      {
         e1.printStackTrace();
         throw e1;
      }

   }
   
   public void testNoDecryption() throws ReaderException, MappingException
   {
      String inputXml= 
            "<?xml version=\"1.0\" encoding=\"utf-8\"?><patient>\n" + 
            "    <description>description</description>\n" + 
            "    <name>John Doe</name>\n" + 
            "    <tubeComment OverrideMode=\"false\" time=\"2015-11-22T12:33\" tech=\"SCC\">some comment</tubeComment>\n" + 
            "</patient>";
      XmlSAXReader reader = new XmlSAXReader();
      Patient pat;
      try
      {
         pat = (Patient)reader.read(Patient.class, inputXml);
         assertEquals("John Doe", pat.name);
         assertEquals("description", pat.desc);
         assertEquals("some comment", pat.tubeComment.value);
         assertEquals("SCC", pat.tubeComment.tech);
         assertEquals("2015-11-22T12:33", pat.tubeComment.time);
         assertNull(pat.id);
      }
      catch (ReaderException e1)
      {
         e1.printStackTrace();
         throw e1;
      }
      catch (MappingException e1)
      {
         e1.printStackTrace();
         throw e1;
      }

   }
}
