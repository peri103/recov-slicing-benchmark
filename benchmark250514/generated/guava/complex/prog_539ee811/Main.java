import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(42);
        
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("Hello");
        listBuilder.add("World");
        ImmutableList<String> stringList = listBuilder.build();
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 100);
        hashMap.put("Key2", 200);
        
        int sum = 0;
        for (String str : stringList) {
            sum += str.length();
        }
        
        for (int i = 0; i < 5; i++) {
            hashMap.put("Key" + (i + 3), i * 10);
        }
        
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        for (Integer num : sortedSet) {
            sum += num;
        }
        
        /* read */ boolean containsValue = sortedSet.contains(42);
        System.out.println("Contains 42: " + containsValue);
        
        System.out.println("Sum of lengths and numbers: " + sum);
        
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}