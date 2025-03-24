import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Writing to the HashSet
        /* write */ set.add("Hello");

        // Reading from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }

        // Reading from the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Reading from the HashSet
        /* read */ boolean containsValue = set.contains("Hello");
        System.out.println("Set contains 'Hello': " + containsValue);

        // Additional operations
        set.add("World");
        list.add(50);
        map.put("Four", 4);

        // Printing final states
        System.out.println("Final HashSet: " + set);
        System.out.println("Final ArrayList: " + list);
        System.out.println("Final HashMap: " + map);
    }
}