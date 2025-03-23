import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableMap.builder();
        /* write */ builder.put("key1", 100);
        ImmutableMap<String, Integer> immutableMap = builder.build();
        
        // Additional complexity
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                list.add(i * 10 + j);
            }
            hashMap.put("list" + i, list);
        }

        // Using the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Contents of " + key + ": " + hashMap.get(key));
        }

        /* read */ int value = immutableMap.get("key1");
        System.out.println(value);

        // Further operations with the HashMap
        for (String key : hashMap.keySet()) {
            List<Integer> values = hashMap.get(key);
            for (Integer val : values) {
                System.out.println("Value from " + key + ": " + val);
            }
        }
    }
}