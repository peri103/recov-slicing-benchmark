import com.google.common.collect.ArrayListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("greeting", "Hello");
        stringMap.put("farewell", "Goodbye");
        
        /* write */ multimap.put("key", 42);
        
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        ArrayListMultimap<String, String> stringMultimap = ArrayListMultimap.create();
        stringMultimap.put("fruit", "apple");
        stringMultimap.put("fruit", "banana");
        stringMultimap.put("vegetable", "carrot");
        
        List<String> fruits = stringMultimap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ List<Integer> values = multimap.get("key");
        System.out.println("Value from multimap: " + values.get(0));
        
        stringMap.put("question", "How are you?");
        for (String question : stringMap.values()) {
            System.out.println("Question: " + question);
        }
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}