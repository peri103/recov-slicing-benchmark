import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        /* write */ builder.put("key", 42);
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Additional unrelated logic
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        
        String fruit = hashMap.get("A");
        System.out.println("Fruit: " + fruit);

        // Additional write-read pair using a different collection
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("Hello");
        ImmutableList<String> list = listBuilder.build();
        String greeting = list.get(0);
        System.out.println("Greeting: " + greeting);

        // Further processing
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Original read
        /* read */ Integer value = map.get("key");
        System.out.println("Value: " + value);

        // More complex logic
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}