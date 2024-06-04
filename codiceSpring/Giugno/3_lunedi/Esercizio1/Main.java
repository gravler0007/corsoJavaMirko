import Annotazioni.Info;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class Main {
    static int counter = 0;

    public static void main(String[] args) {
        
        Person person1 = new Person("Mirko", 72);
        Person person2 = new Person("Panna", 1200);

        if (Person.class.isAnnotationPresent(Info.class)) {
            Info info = Person.class.getAnnotation(Info.class);
            System.out.println("Autore: " + info.author() + ", Versione: " + info.version());
        }

        inXml(person1, "fileXml");
        inXml(person2, "fileXml");

        // Method[] metodi = Person.class.getDeclaredMethods();
        // for (Method metodo : metodi) {
        //     if (metodo.isAnnotationPresent(DeprecatedCustom.class)) {
        //         DeprecatedCustom deprecatedCustom = metodo.getAnnotation(DeprecatedCustom.class);
        //         System.out.println(deprecatedCustom.message());
        //     }
        // }

    }

    public static void inXml(Person person, String fileName) {

        try { 

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document;
            Element root;

            File file = new File(fileName);
            if (file.exists()) {
                // Se il file esiste, carica il documento esistente
                document = documentBuilder.parse(file);
                root = document.getDocumentElement();
            } else {
                // Se il file non esiste, crea un nuovo documento
                document = documentBuilder.newDocument();
                root = document.createElement("Users");
                document.appendChild(root);
            }

            // User element
            Element userElement = document.createElement("person");
            root.appendChild(userElement);

            userElement.setAttribute("id", String.valueOf(++counter)); // Converte counter (un intero) in una stringa

            Element firstName = document.createElement("name");
            firstName.appendChild(document.createTextNode(person.getName()));
            userElement.appendChild(firstName);

            Element age = document.createElement("age");
            age.appendChild(document.createTextNode(String.valueOf(person.getAge())));
            userElement.appendChild(age);

            Element lastName = document.createElement("info");
            lastName.appendChild(document.createTextNode(person.getInfo()));
            userElement.appendChild(lastName);


            // Creare l'istanza di TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            // Creare il file XML
            StreamResult streamResult = new StreamResult(new File(fileName));

            System.out.println("L'utente è stato salvato nel file " + fileName);

            // Trasformare il DOM in un file XML
            transformer.transform(domSource, streamResult);

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
