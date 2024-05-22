public class ProvaMetodi {

    int x = 5;

    
    public static void main(String[] args) {

        ProvaMetodi myObject = new ProvaMetodi();
        System.out.println(myObject.x);
        myMethod();

    }
    
    static void myMethod() {
        System.out.println("Sono un metodo statico");
    }
}
