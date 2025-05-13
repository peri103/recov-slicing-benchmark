import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSet.builder();
        /* write */ builder.add("testValue");

        // Additional complex code
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integerSet.add(i);
        }

        for (Integer num : integerSet) {
            System.out.println("Number: " + num);
        }

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");

        for (String str : stringSet) {
            System.out.println("String: " + str);
        }

        ImmutableSet<String> set = builder.build();
        // More complex code before reading the value
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println(containsValue);

        // Additional complex code
        Set<Double> doubleSet = new HashSet<>();
        for (double d = 0.0; d < 5.0; d += 0.5) {
            doubleSet.add(d);
        }

        for (Double d : doubleSet) {
            System.out.println("Double: " + d);
        }

        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);
    }
}