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

        // Writing to the Hashtable
        /* write */ table.put("key", 123);

        // Reading from the Hashtable
        /* read */ Integer value = table.get("key");

        // Printing the value from the Hashtable
        System.out.println("Value from Hashtable: " + value);

        // Printing elements from the ArrayList
        System.out.println("Elements from ArrayList:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // Printing elements from the LinkedList
        System.out.println("Elements from LinkedList:");
        for (String str : linkedList) {
            System.out.println(str);
        }

        // Adding elements from ArrayList to Hashtable
        for (int i = 0; i < list.size(); i++) {
            table.put("listKey" + i, list.get(i));
        }

        // Reading and printing elements from Hashtable added from ArrayList
        System.out.println("Elements from Hashtable added from ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(table.get("listKey" + i));
        }
    }
}