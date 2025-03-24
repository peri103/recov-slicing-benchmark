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

        /* write */ vector.addElement(1);

        // Performing some operations with the ArrayList and LinkedList
        for (Object obj : list) {
            System.out.println(obj);
        }

        for (Object obj : linkedList) {
            System.out.println(obj);
        }

        // Adding more elements to the Vector
        vector.addElement(2);
        vector.addElement(3);

        // Performing some operations with the Vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i));
        }

        /* read */ int value = (Integer) vector.elementAt(0);
        System.out.println("The value read from the Vector is: " + value);

        // Additional complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Adding all elements from numbers to the Vector
        for (int i = 0; i < numbers.size(); i++) {
            vector.addElement(numbers.get(i));
        }

        // Printing all elements in the Vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i));
        }
    }
}