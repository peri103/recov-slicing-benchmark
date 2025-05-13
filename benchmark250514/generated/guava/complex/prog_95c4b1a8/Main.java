import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> temporaryList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Adding elements to temporaryList
        for (int i = 0; i < 5; i++) {
            temporaryList.add(i * 2);
        }

        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        /* write */ builder.add(1);
        
        // Adding more elements to the builder
        for (int i = 0; i < temporaryList.size(); i++) {
            builder.add(temporaryList.get(i));
        }

        ImmutableList<Integer> list = builder.build();

        // Performing operations on map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // More complex calculations
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum: " + sum);

        /* read */ int value = list.get(0);
        System.out.println(value);

        // Additional operations
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}