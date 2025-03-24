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
        linkedList.add("Hello");
        linkedList.add("World");

        // Writing a value to the Hashtable
        /* write */ hashtable.put("key", 42);

        // Performing some operations with ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading the value from the Hashtable
        /* read */ int value = hashtable.get("key");
        System.out.println("Value from Hashtable: " + value);

        // Adding more complexity
        Hashtable<String, String> anotherHashtable = new Hashtable<>();
        anotherHashtable.put("anotherKey", "AnotherValue");
        System.out.println("Another Hashtable value: " + anotherHashtable.get("anotherKey"));

        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Java");
        anotherList.add("Programming");
        for (String str : anotherList) {
            System.out.println("Another ArrayList element: " + str);
        }
    }
}