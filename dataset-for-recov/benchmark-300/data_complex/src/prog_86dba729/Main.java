import java.util.concurrent.ConcurrentSkipListMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
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

        // Writing to the ConcurrentSkipListMap
        /* write */ map.put(1, "Hello");

        // Reading from the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList Element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList Element: " + str);
        }

        // Reading from the ConcurrentSkipListMap
        /* read */ String value = map.get(1);
        System.out.println("ConcurrentSkipListMap Value: " + value);

        // Adding more elements to the ArrayList
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Printing the updated ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList Element: " + list.get(i));
        }
    }
}