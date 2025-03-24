import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        /* write */ vector.add(42);

        // Processing the ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Processing the LinkedList
        for (Integer num : linkedList) {
            System.out.println("LinkedList element: " + num);
        }

        /* read */ int value = vector.get(0);
        System.out.println("Value from Vector: " + value);

        // Adding more elements to the Vector
        for (int i = 1; i <= 5; i++) {
            vector.add(i * 100);
        }

        // Printing all elements from the Vector
        for (Integer num : vector) {
            System.out.println("Vector element: " + num);
        }
    }
}