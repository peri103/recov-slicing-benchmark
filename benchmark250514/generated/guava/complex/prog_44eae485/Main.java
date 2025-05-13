import com.google.common.collect.ImmutableSortedSet;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Create a HashSet and add some elements
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        
        // Create an ArrayList and add some elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        
        // Add elements from HashSet to builder
        for (Integer num : hashSet) {
            builder.add(num);
        }
        
        // Perform operations on ArrayList
        int sum = 0;
        for (Integer num : arrayList) {
            sum += num;
        }
        
        System.out.println("Sum of elements in arrayList: " + sum);
        
        // Add a specific value to the builder
        /* write */ builder.add(42);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Perform operations on HashSet
        hashSet.remove(10);
        hashSet.add(40);
        
        // Check if the set contains the specific value
        /* read */ boolean containsValue = set.contains(42);
        
        // Print the result
        System.out.println("Does the set contain 42? " + containsValue);
        
        // Perform more operations on ArrayList
        arrayList.add(400);
        arrayList.remove(Integer.valueOf(100));
        
        // Print the modified ArrayList
        System.out.println("Modified arrayList: " + arrayList);
    }
}