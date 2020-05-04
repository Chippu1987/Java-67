package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLSax {

	public static void main(String[] args) throws Exception{
		  SAXParserFactory factory = SAXParserFactory.newInstance();
		  SAXParser parser = factory.newSAXParser();
		  
		  File file = new File("src/co/edureka/xml/staff.xml");
		  MyHandler handler=new MyHandler();
		  
		  parser.parse(file, handler);
	}
}

class MyHandler extends DefaultHandler{
	boolean fname = false;
	boolean lname = false;
	boolean nname = false;
	boolean salary = false;	
	
	public void startDocument() throws SAXException 
	{
	  System.out.println("Document Parsing Started!");
	}

	public void endDocument() throws SAXException 
	{
	  System.out.println("Document Parsing Completed!");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
      //System.out.println(qName);
	
		if(qName.contentEquals("staff")) {
          System.out.println("-----------------------------");
          System.out.println("Staff ID = "+ attributes.getValue("id"));
		}
		else if(qName.contentEquals("firstname"))
			fname=true;
		else if(qName.contentEquals("lastname"))
			lname=true;
		else if(qName.contentEquals("nickname"))
			nname=true;
		else if(qName.contentEquals("salary"))
			salary=true;
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	  if(qName.equals("staff"))
		  System.out.println("-----------------------------");
	}
	public void characters(char[] ch, int start, int length) throws SAXException 
	{
   	  String data=new String(ch,start,length);	
	  if(fname) {	
	   System.out.println("First Name : "+data);
	   fname=false;
	  }
	  else if(lname) {	
	   System.out.println("Last Name : "+data);
	   lname=false;
	  }
	  else if(nname) {	
	   System.out.println("Nick Name : "+data);
	   nname=false;
	  }	 
	  else if(salary) {	
	   System.out.println("Salary : "+data);
	   salary=false;
	  }	  
	}	
}
