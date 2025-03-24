import com.google.common.collect.ArrayListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        /* write */ multimap.put("key1", 100);
        
        // Additional unrelated code to increase complexity
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // More unrelated code
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringBuilder.append("Line ").append(i + 1).append("\n");
        }
        System.out.println(stringBuilder.toString());

        /* read */ List<Integer> values = multimap.get("key1");
        System.out.println(values.get(0));
        
        // Additional unrelated code
        for (int i = 0; i < 3; i++) {
            System.out.println("This is an unrelated line " + (i + 1));
        }
    }
}