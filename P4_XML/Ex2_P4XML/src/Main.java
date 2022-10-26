import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try{
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new URL("https://www.xataka.com/sitemap_index.xml").openStream());
            doc.getDocumentElement().normalize();
            NodeList list = doc.getElementsByTagName("loc");

            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                Element element = (Element) node;

                System.out.println("___________________________________________________");
                System.out.println("URL: " + element.getTextContent());

                Document subDoc = db.parse(new URL(node.getTextContent()).openStream());
                subDoc.getDocumentElement().normalize();
                NodeList SubList = subDoc.getElementsByTagName("loc");

                for (int j = 0; j < SubList.getLength(); j++) {
                    Node SubNode = SubList.item(j);
                    System.out.println("     SubURL: " + SubNode.getTextContent());
                }
            }
        } catch (IOException | ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}