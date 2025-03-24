import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
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

        /* write */ map.put("key", 42);

        // Iterating through the ArrayList and printing elements
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Iterating through the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Creating another HashMap and adding elements
        HashMap<String, String> anotherMap = new HashMap<>();
        anotherMap.put("name", "Alice");
        anotherMap.put("age", "30");

        // Printing elements from the second HashMap
        for (String key : anotherMap.keySet()) {
            System.out.println("Another Map key: " + key + ", value: " + anotherMap.get(key));
        }

        /* read */ Integer value = map.get("key");
        System.out.println("Value from the original HashMap: " + value);
    }
}