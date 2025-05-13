import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.builder();
        ImmutableList.Builder<String> stringBuilder = ImmutableList.builder();
        
        // Adding elements to the ImmutableSortedSet builder
        builder.add(42);
        builder.add(100);
        builder.add(5);
        
        // Adding elements to the ImmutableList builder
        stringBuilder.add("Hello");
        stringBuilder.add("World");
        
        // Building the ImmutableList
        ImmutableList<String> stringList = stringBuilder.build();
        
        // Using the ImmutableList
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Building the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Performing operations on the ImmutableSortedSet
        for (Integer num : sortedSet) {
            System.out.println("Number: " + num);
        }
        
        // Some unrelated computation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 0 to 9: " + sum);
        
        // More complex logic
        int max = Integer.MIN_VALUE;
        for (int num : sortedSet) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number in the set: " + max);
        
        // Check if the set contains a specific value
        /* read */ boolean containsValue = sortedSet.contains(42);
        System.out.println("Does the set contain 42? " + containsValue);
    }
}