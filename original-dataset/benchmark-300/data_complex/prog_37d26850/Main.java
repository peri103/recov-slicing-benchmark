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

        /* write */ table.put("key", 42);

        // Iterating through the ArrayList and printing elements
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Iterating through the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        /* read */ Integer value = table.get("key");
        System.out.println("Value from Hashtable: " + value);

        // Adding more elements to the ArrayList
        list.add(100);
        list.add(200);

        // Printing the updated ArrayList
        for (Integer num : list) {
            System.out.println("Updated ArrayList element: " + num);
        }
    }
}