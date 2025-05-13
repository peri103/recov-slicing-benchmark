import com.google.common.collect.LinkedListMultimap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();

        // Adding elements to arrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }

        // Adding elements to hashMap
        hashMap.put("name", "John Doe");
        hashMap.put("age", "30");

        // Performing operations on hashMap
        String name = hashMap.get("name");
        System.out.println("Name: " + name);

        // Performing operations on arrayList
        for (int num : arrayList) {
            System.out.println("ArrayList element: " + num);
        }

        /* write */ multimap.put("key1", 42);

        // Additional operations to make the program complex
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 20 == 0) {
                hashMap.put("special", "Element " + arrayList.get(i));
            }
        }

        String specialElement = hashMap.get("special");
        System.out.println("Special Element: " + specialElement);

        // More operations on multimap
        multimap.put("key2", 84);
        multimap.put("key3", 126);

        /* read */ List<Integer> values = multimap.get("key1");
        System.out.println(values);

        // Final operations
        for (String key : multimap.keySet()) {
            List<Integer> list = multimap.get(key);
            System.out.println("Multimap key: " + key + ", values: " + list);
        }
    }
}