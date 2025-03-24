import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("First");
        linkedList.add("Second");

        /* write */ map.putIfAbsent("key", 123);

        // Iterating over the ArrayList and printing elements
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Adding elements from ArrayList to the ConcurrentHashMap
        for (int i = 0; i < list.size(); i++) {
            map.putIfAbsent("listKey" + i, list.get(i));
        }

        // Iterating over the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        /* read */ Integer value = map.get("key");
        System.out.println("Value from ConcurrentHashMap: " + value);

        // Adding more elements to the ArrayList and LinkedList
        list.add(30);
        linkedList.add("Third");

        // Printing the updated ArrayList and LinkedList
        System.out.println("Updated ArrayList: " + list);
        System.out.println("Updated LinkedList: " + linkedList);
    }
}