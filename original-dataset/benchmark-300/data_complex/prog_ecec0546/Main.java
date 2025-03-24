import java.util.concurrent.ConcurrentSkipListMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("First");
        linkedList.add("Second");

        // Writing to the ConcurrentSkipListMap
        /* write */ map.put("key", 123);

        // Performing some operations on the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the ConcurrentSkipListMap
        /* read */ Integer value = map.get("key");
        System.out.println("Value from ConcurrentSkipListMap: " + value);

        // Adding more elements to the ArrayList
        list.add(30);
        list.add(40);

        // Printing the updated ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList element: " + list.get(i));
        }

        // Adding more elements to the LinkedList
        linkedList.add("Third");
        linkedList.add("Fourth");

        // Printing the updated LinkedList
        for (String str : linkedList) {
            System.out.println("Updated LinkedList element: " + str);
        }
    }
}