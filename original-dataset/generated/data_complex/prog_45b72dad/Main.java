import java.util.concurrent.ConcurrentSkipListMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the HashMap
        hashMap.put("name", "John");
        hashMap.put("city", "New York");

        // Add elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Perform some operations on the ArrayList
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Perform operations on the HashMap
        String name = hashMap.get("name");
        System.out.println("Name from HashMap: " + name);

        /* write */ map.put("key", 100);

        // More operations on the HashMap
        hashMap.put("country", "USA");
        String city = hashMap.get("city");
        System.out.println("City from HashMap: " + city);

        // Perform operations on the ConcurrentSkipListMap
        map.put("anotherKey", 200);
        Integer anotherValue = map.get("anotherKey");
        System.out.println("Another value from ConcurrentSkipListMap: " + anotherValue);

        // Perform operations on the ArrayList
        list.add("date");
        list.remove("banana");

        /* read */ Integer value = map.get("key");
        System.out.println("Value from ConcurrentSkipListMap: " + value);

        // Final operations on the ArrayList
        for (String fruit : list) {
            System.out.println("Updated Fruit List: " + fruit);
        }
    }
}