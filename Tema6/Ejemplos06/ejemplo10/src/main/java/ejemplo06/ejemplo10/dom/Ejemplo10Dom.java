/*
  ejemplo xml dom
 */

package ejemplo06.ejemplo10.dom;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author cic
 */
public class Ejemplo10Dom {

    public static void main(String[] args) {
        try {
            //creating a constructor of file class and parsing an XML file
            File file = new File("ejemplo.xml");
            //an instance of factory that gives a document builder 
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            //an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Elemento Raiz: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("student");
            // nodeList is not iterable, so we are using for loop  
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);
                System.out.println("\n Nombre nodo: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    System.out.println("id " + eElement.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("nombre " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("apellido " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("asignatura " + eElement.getElementsByTagName("subject").item(0).getTextContent());
                    System.out.println("puntos" + eElement.getElementsByTagName("marks").item(0).getTextContent());

                }
            }

        } catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
            e.printStackTrace();
        }
    }
}
