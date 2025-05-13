import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Building an ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        /* write */ builder.put("key1", 100);
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Additional unrelated operations to increase complexity
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key2", 200);
        hashMap.put("key3", 300);
        
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        listBuilder.add(10).add(20).add(30);
        ImmutableList<Integer> immutableList = listBuilder.build();

        for (Integer num : immutableList) {
            System.out.println("ImmutableList item: " + num);
        }

        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of HashMap values: " + sum);

        // Reading from the ImmutableSortedMap
        /* read */ Integer value = map.get("key1");
        System.out.println("Value from ImmutableSortedMap: " + value);

        // Further unrelated operations
        int product = 1;
        for (Integer num : immutableList) {
            product *= num;
        }
        System.out.println("Product of ImmutableList items: " + product);
    }
}