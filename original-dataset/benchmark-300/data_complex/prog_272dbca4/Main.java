import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        ArrayList list = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // Adding elements to the ArrayList and LinkedList
        list.add("Hello");
        linkedList.add(100);

        /* write */ vector.add(1);

        // Adding elements from ArrayList and LinkedList to the Vector
        vector.addAll(list);
        vector.addAll(linkedList);

        // Iterating through the Vector and printing elements
        for (Object obj : vector) {
            System.out.println(obj);
        }

        /* read */ int value = (Integer) vector.get(0);
        System.out.println("Read value from Vector: " + value);

        // Adding more elements to the Vector
        for (int i = 2; i <= 5; i++) {
            vector.add(i);
        }

        // Printing all elements in the Vector
        for (Object obj : vector) {
            System.out.println(obj);
        }
    }
}