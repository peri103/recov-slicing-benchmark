import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Initialize some values in the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add("Element " + i);
        }

        /* write */ map.put("key", 123);

        // Perform some operations on the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList value: " + str);
        }

        // Add some more elements to the list
        list.add(100);
        list.add(200);

        // Perform more operations
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated List value: " + list.get(i));
        }

        /* read */ int value = map.get("key");
        System.out.println("Value from map: " + value);
    }
}