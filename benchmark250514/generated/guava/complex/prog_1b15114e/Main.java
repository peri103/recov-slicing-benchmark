import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("hello", "world");
        hashMap.put("foo", "bar");
        
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        ImmutableList<String> fruits = listBuilder.build();

        /* write */ builder.put("key", 42);
        builder.put("anotherKey", 84);
        
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        System.out.println("Sum of values in map: " + sum);
        
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Value: " + hashMap.get(key));
        }
        
        /* read */ int value = map.get("key");
        System.out.println("Value for 'key': " + value);
        
        int doubleValue = value * 2;
        System.out.println("Double of the read value: " + doubleValue);
    }
}