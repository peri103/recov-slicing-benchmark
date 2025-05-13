import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableSet.Builder
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();
        
        // Add an element to the set using the builder
        /* write */ builder.add("element");

        // Perform unrelated operations
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 10; i++) {
            listBuilder.add(i);
        }
        ImmutableList<Integer> immutableList = listBuilder.build();
        int sum = 0;
        for (Integer num : immutableList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Build the ImmutableSet
        ImmutableSet<String> immutableSet = builder.build();

        // Perform some operations on the set
        if (immutableSet.size() > 0) {
            System.out.println("Set is not empty");
        }

        // Check if the set contains the element
        /* read */ boolean containsElement = immutableSet.contains("element");
        
        // Print the result
        System.out.println(containsElement);

        // More unrelated operations
        ImmutableSet.Builder<Double> doubleSetBuilder = ImmutableSet.builder();
        doubleSetBuilder.add(1.1).add(2.2).add(3.3);
        ImmutableSet<Double> doubleSet = doubleSetBuilder.build();
        double product = 1.0;
        for (Double d : doubleSet) {
            product *= d;
        }
        System.out.println("Product of elements: " + product);
    }
}