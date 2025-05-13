import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSet.builder();
        Map<String, Integer> map = new HashMap<>();
        
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        /* write */ builder.add(10);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            builder.add(entry.getValue());
        }
        
        ImmutableSet<Integer> set = builder.build();
        
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        
        System.out.println("Sum of all elements in the set: " + sum);
        
        /* read */ boolean containsValue = set.contains(10);
        
        System.out.println("Does the set contain the value 10? " + containsValue);
        
        int max = Integer.MIN_VALUE;
        for (Integer num : set) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Maximum value in the set: " + max);
        
        int min = Integer.MAX_VALUE;
        for (Integer num : set) {
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println("Minimum value in the set: " + min);
    }
}