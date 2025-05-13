import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder as ListBuilder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        ListBuilder<String> listBuilder = ImmutableList.builder();
        
        listBuilder.add("Alpha");
        listBuilder.add("Beta");
        listBuilder.add("Gamma");
        
        ImmutableList<String> stringList = listBuilder.build();
        for (String s : stringList) {
            System.out.println(s);
        }
        
        /* write */ builder.add(1);
        builder.add(2);
        builder.add(3);
        
        ImmutableSortedSet<Integer> set = builder.build();
        
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        
        System.out.println("Sum of elements in set: " + sum);
        
        // Unrelated operations to increase complexity
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        /* read */ boolean contains = set.contains(1);
        System.out.println("Set contains 1: " + contains);
        
        int max = Integer.MIN_VALUE;
        for (Integer num : set) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element in set: " + max);
        
        // Further operations to increase complexity
        int min = Integer.MAX_VALUE;
        for (Integer num : set) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum element in set: " + min);
    }
}