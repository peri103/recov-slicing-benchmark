import java.util.Hashtable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Writing to the Hashtable
        /* write */ hashtable.put("key", 123);

        // Performing some operations with ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the Hashtable
        /* read */ int value = hashtable.get("key");
        System.out.println("Value from Hashtable: " + value);

        // Adding more complexity with a nested loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nested loop iteration: " + i + ", " + j);
            }
        }

        // Creating another Hashtable and performing operations
        Hashtable<String, String> anotherHashtable = new Hashtable<>();
        anotherHashtable.put("name", "John");
        anotherHashtable.put("age", "30");
        System.out.println("Another Hashtable: " + anotherHashtable);
    }
}