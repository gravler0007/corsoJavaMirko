import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array:" + Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arr = arrayList.toArray(arr);
        System.out.println("Array dopo aver aggiunto l'elemento: " + Arrays.toString(arr));
    }
}
