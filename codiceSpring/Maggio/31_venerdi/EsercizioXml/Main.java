import java.util.Scanner;
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
import java.io.File;

public class Main {

    static int counter = 0;
    public static void main(String[] args) {

        Scanner scannerString = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        String response ;
        String fileName ;

        User user = UserInput.createUser(scannerString, scannerNumber);
        System.out.println("\nUtente creato correttamente!!!!\n");

        //stampa user
        System.out.println(user.toString());

        System.out.print("\nVuoi salvare l'utente in un file xml? (s/n): ");
        response = scannerString.nextLine();
        if (response.equalsIgnoreCase("s")) {
            System.out.print("Enter the file name: ");
            fileName = scannerString.nextLine();
            inXml(user, fileName);
        }

        scannerString.close();
        scannerNumber.close();

    }

    
    public static void inXml(User user, String fileName) {

        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Users");
            document.appendChild(root);

            // User element
            Element userElement = document.createElement("user");
            root.appendChild(userElement);


            userElement.setAttribute("id", String.valueOf(counter+1)); // Converte counter (un intero) in una stringa

            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode(user.getFirstName()));
            userElement.appendChild(firstName);

            Element lastName = document.createElement("lastName");
            lastName.appendChild(document.createTextNode(user.getLastName()));
            userElement.appendChild(lastName);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode(user.getEmail()));
            userElement.appendChild(email);

            Element age = document.createElement("age");
            age.appendChild(document.createTextNode(String.valueOf(user.getAge())));
            userElement.appendChild(age);

            // Aggiungo gli attributi all'elemento user
            // userElement.setAttribute("id", String.valueOf(counter++)); // Converte counter (un intero) in una stringa
            // userElement.setAttribute("firstName", user.getFirstName());
            // userElement.setAttribute("lastName", user.getLastName());
            // userElement.setAttribute("email", user.getEmail());
            // userElement.setAttribute("age", String.valueOf(user.getAge())); // Converte user.getAge() (un intero) in una stringa

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
        }
    }

}
