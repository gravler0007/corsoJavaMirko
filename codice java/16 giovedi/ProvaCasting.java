public class ProvaCasting {
    public static void main(String[] args) {
        
        int a = 5, b = 3;
        float c, d;

        c = a / b;
        d = (float) a/b;

        System.out.println("casting implicito: 5/3 = " + c);
        System.out.println("casting esplicito: 5/3 = " + d);
        
    }
}
