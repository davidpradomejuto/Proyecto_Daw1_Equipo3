/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo06.ejemplo10.Sax;

/**
 *
 * @author cic
 */
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Ejemplo10Sax {

    public static void main(String[] args) {
        try {
            //creating a constructor of file class and parsing an XML file
            File file = new File("ejemplo.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean id = false;
                boolean firstname = false;
                boolean lastname = false;
                boolean subject = false;
                boolean marks = false;
                //parser starts parsing a specific element inside the document
                @Override
                public void startElement(String uri, String localName, String gName, Attributes attributes) throws SAXException {
                    System.out.println("comienza elemento: " + gName);
                    if (gName.equalsIgnoreCase("Id")) {
                        id = true;
                    }
                   if (gName.equalsIgnoreCase("Firstname")) {
                        firstname = true;
                    }

                }
                //parser ends parsing the specific element inside the document
                @Override
                public void endElement(String uri, String localName, String gName)throws SAXException{
                    System.out.println("final elemento "+gName);
                }
                
                // read the text value of the currently parsed element
                @Override
                public void characters(char ch[],int start, int length)throws SAXException{
                    if(id){
                        System.out.println("id "+new String(ch,start,length));
                        id=false;
                    }
                    if(firstname){
                        System.out.println("first name "+ new String(ch,start,length));
                        firstname=false;
                    }
                }

            };
            saxParser.parse(file, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
