import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Madza");
        System.out.println(cars);
        cars.set(0, "Opel");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        System.out.println(cars.isEmpty());
    }
}
