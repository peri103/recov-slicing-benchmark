import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        Multimap<String, Integer> multimap = LinkedHashMultimap.create();

        // Additional data structures
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Guava");
        map.put("version", "30.1");

        // Additional write-read pair using HashMap
        map.put("author", "Google");
        String author = map.get("author");
        System.out.println("Author: " + author);

        // Some processing
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }

        // Writing to the multimap
        /* write */ multimap.put("key", 42);

        // More unrelated processing
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);

        // Reading from the multimap
        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }

        // Another unrelated data structure
        Multimap<String, String> stringMultimap = LinkedHashMultimap.create();
        stringMultimap.put("fruit", "apple");
        stringMultimap.put("fruit", "banana");
        Collection<String> fruits = stringMultimap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}