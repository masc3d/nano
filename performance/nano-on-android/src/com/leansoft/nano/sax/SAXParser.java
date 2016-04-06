package com.leansoft.nano.sax;

import android.util.Log;
import com.leansoft.nano.person.PersonListType;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

public class SAXParser {

    public static PersonListType parse(InputStream is) {
        PersonListType personList = null;
        try {
            // create a XMLReader from SAXParser
            XMLReader xmlReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            // create a SAXHanlder
            SAXHandler saxHandler = new SAXHandler();
            // store handler in XMLReader
            xmlReader.setContentHandler(saxHandler);
            // the process starts
            xmlReader.parse(new InputSource(is));
            // get the persons
            personList = saxHandler.getPersonList();
        } catch (Exception ex) {
            Log.d("SAX Parser", "parse failed");
        }

        return personList;
    }

}
