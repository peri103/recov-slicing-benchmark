import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        /* write */ vector.add(1);

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        // Printing elements from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Printing elements from the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        /* read */ int value = vector.get(0);
        System.out.println("Value from Vector: " + value);

        // Adding all elements from ArrayList to Vector
        for (int i = 0; i < list.size(); i++) {
            vector.add(list.get(i));
        }

        // Printing all elements from the Vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Vector element: " + vector.get(i));
        }
    }
}