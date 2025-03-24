import java.util.Hashtable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        /* write */ table.put("key", 123);

        // Processing ArrayList
        for (int num : list) {
            System.out.println("ArrayList value: " + num);
        }

        // Processing LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList value: " + str);
        }

        /* read */ int value = table.get("key");
        System.out.println("Hashtable value: " + value);

        // Additional operations
        Hashtable<String, String> anotherTable = new Hashtable<>();
        anotherTable.put("anotherKey", "AnotherValue");

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println("String List value: " + str);
        }

        System.out.println("Another Hashtable value: " + anotherTable.get("anotherKey"));
    }
}