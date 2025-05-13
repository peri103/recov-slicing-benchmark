import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        /* write */ builder.put("key1", 100);
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Additional operations with other collections
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }

        // Processing the ArrayList
        int sum = 0;
        for (Integer num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum);

        // Using ImmutableList
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        for (String fruit : immutableList) {
            System.out.println("Fruit: " + fruit);
        }

        // Accessing the value from the original write-read pair
        /* read */ Integer value = map.get("key1");
        System.out.println("Value from ImmutableSortedMap: " + value);

        // More complex operations
        hashMap.put("country", "Fantasy Land");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Modifying the ArrayList
        arrayList.add(50);
        arrayList.remove(0);
        System.out.println("Modified ArrayList: " + arrayList);
    }
}