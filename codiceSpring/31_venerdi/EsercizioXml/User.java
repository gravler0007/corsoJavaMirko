// Obiettivo: L'obiettivo di questo esercizio è creare un programma in Java che consenta di creare un utente attraverso una serie 
// di passaggi obbligatori e di serializzare i dati dell'utente in un file XML dopo aver ricevuto un input specifico.

// Descrizione dell'Esercizio:
// Creazione di un Utente:
//     Implementare una classe User con i seguenti campi obbligatori:
//         String firstName
//         String lastName
//         String email
//         int age

//     La classe User deve includere costruttori, getter, setter e un metodo toString() che restituisca 
//     una rappresentazione testuale dell'utente.

// Input Utente:
//     Creare una classe UserInput con un metodo statico createUser() che:
//         Richieda all'utente di inserire il proprio firstName, lastName, email e age.
//         Validare che i campi firstName, lastName e email non siano vuoti e che age sia un numero intero positivo.
//         Restituire un oggetto User con i dati forniti.

// Serializzazione in XML:
//     Implementare un metodo serializeToXML(User user, String fileName) che:
//         Utilizzi la libreria JAXB (Java Architecture for XML Binding) per convertire l'oggetto User in un file XML.
//         Salvi il file XML con il nome specificato dal parametro fileName.

// Interfaccia Utente:
//     Creare una classe Main con il metodo main che:
//         Chiami UserInput.createUser() per ottenere un oggetto User.
//         Stampi le informazioni dell'utente appena creato.
//         Chieda all'utente se vuole salvare le informazioni in un file XML.
//         Se l'utente risponde affermativamente, chiami serializeToXML(user, fileName) per salvare i dati in un file XML.

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;

    //lo metto qui per ora
    public User(){};

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User: [" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ']';
    }
    
}