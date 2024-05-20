public class ProvaCostruttore {

    //attributi
    //int x;
    int modelYear;
    String modelName;

    public ProvaCostruttore(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }
    public static void main(String[] args) {
        ProvaCostruttore myObject = new ProvaCostruttore(1969, "Mustang");
        System.out.println(myObject.modelYear + " " + myObject.modelName);

    }
}
