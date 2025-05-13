import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(42);
        
        // Adding more elements to the builder
        builder.add(10);
        builder.add(5);
        builder.add(100);
        
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Perform some operations on the set
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(set);
        hashSet.add(50);
        
        // Check if the set contains a specific value
        boolean containsTen = set.contains(10);
        System.out.println("Contains 10: " + containsTen);
        
        // Iterate over the set and print each element
        for (Integer num : set) {
            System.out.println("Set element: " + num);
        }
        
        // Perform some calculations
        int sum = 0;
        for (Integer num : hashSet) {
            sum += num;
        }
        System.out.println("Sum of elements in hashSet: " + sum);
        
        // Some unrelated logic
        int maxValue = Integer.MIN_VALUE;
        for (Integer num : hashSet) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println("Max value in hashSet: " + maxValue);
        
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Contains 42: " + containsValue);
        
        // More unrelated logic
        int minValue = Integer.MAX_VALUE;
        for (Integer num : hashSet) {
            if (num < minValue) {
                minValue = num;
            }
        }
        System.out.println("Min value in hashSet: " + minValue);
    }
}