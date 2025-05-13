import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();
        /* write */ builder.add("example");
        ImmutableSet<String> set = builder.build();

        // Additional code to add complexity
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i * 10);
        }
        ImmutableList<Integer> list = listBuilder.build();
        
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Some unrelated computation
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Ensure the original read occurs only once
        /* read */ boolean contains = set.contains("example");
        System.out.println(contains);

        // Further unrelated code
        int squareSum = 0;
        for (int i = 1; i <= 3; i++) {
            squareSum += i * i;
        }
        System.out.println("Sum of squares from 1 to 3: " + squareSum);
    }
}