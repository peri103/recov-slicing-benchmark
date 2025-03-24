import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Performing operations on the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Performing operations on the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        /* write */ map.putIfAbsent("key", 42);

        // Adding elements to the map
        map.put("key2", 100);
        map.put("key3", 200);

        // Performing more operations on the map
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }

        /* read */ Integer value = map.get("key");
        System.out.println("Value for 'key': " + value);

        // Additional unrelated code to make the program more complex
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println("String list element: " + str);
        }
    }
}