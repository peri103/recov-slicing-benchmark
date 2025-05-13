import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original LinkedListMultimap write-read pair
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        
        /* write */ multimap.put("key", 42);
        
        // Adding more complex operations with HashMap
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(i * 10);
        }
        hashMap.put("numbers", list1);
        
        // Performing operations on the HashMap
        List<Integer> retrievedList = hashMap.get("numbers");
        for (Integer num : retrievedList) {
            System.out.println("HashMap Value: " + num);
        }
        
        // Another LinkedListMultimap usage without /* write */ and /* read */
        LinkedListMultimap<String, String> multimap2 = LinkedListMultimap.create();
        multimap2.put("greeting", "Hello");
        multimap2.put("greeting", "World");
        List<String> greetings = multimap2.get("greeting");
        for (String greeting : greetings) {
            System.out.println("Greeting: " + greeting);
        }
        
        // Original read operation far apart from the write
        /* read */ Integer value = multimap.get("key").get(0);
        System.out.println("Original Read Value: " + value);
        
        // Additional operations with ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Guava");
        arrayList.add("Complexity");
        
        for (String item : arrayList) {
            System.out.println("ArrayList Item: " + item);
        }
    }
}