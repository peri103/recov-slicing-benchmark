import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        List<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Adding elements to the linked list
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");

        /* write */ set.add("test");

        // Performing some operations with the map
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Performing some operations with the list
        for (Integer num : list) {
            System.out.println("List element: " + num);
        }

        // Performing some operations with the linked list
        for (String str : linkedList) {
            System.out.println("Linked list element: " + str);
        }

        /* read */ boolean contains = set.contains("test");
        System.out.println("Set contains 'test': " + contains);

        // Additional operations to make the program more complex
        List<String> newList = new ArrayList<>();
        newList.add("newElement1");
        newList.add("newElement2");
        newList.add("newElement3");

        for (String element : newList) {
            System.out.println("New list element: " + element);
        }

        // Adding all elements from newList to the set
        set.addAll(newList);

        // Checking if the set contains all elements from newList
        boolean allContains = set.containsAll(newList);
        System.out.println("Set contains all elements from newList: " + allContains);
    }
}