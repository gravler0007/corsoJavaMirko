public class cicli {
    public static void main(String[] args) {
        
        int i = 1, k = 1, max = 0;

        while (i < max) {
            System.out.println("Sono nel ciclo while all' iterazione numero: " + i);
            ++i;
        }

        System.out.println("\n");

        do {
            System.out.println("Sono nel ciclo do-while all' iterazione numero: " + k);
            ++k;
        } while (k < max);

    }
}
