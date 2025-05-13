import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        ImmutableSet<String> immutableSet = ImmutableSet.of("apple", "banana", "cherry");

        for (String fruit : immutableSet) {
            System.out.println("Fruit: " + fruit);
        }

        /* write */ builder.add(42);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        ImmutableSortedSet<Integer> sortedSet = builder.build();

        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        /* read */ boolean containsValue = sortedSet.contains(42);
        System.out.println(containsValue);

        Builder<String> stringBuilder = ImmutableSortedSet.naturalOrder();
        stringBuilder.add("dog").add("cat").add("bird");
        ImmutableSortedSet<String> animalSet = stringBuilder.build();

        for (String animal : animalSet) {
            System.out.println("Animal: " + animal);
        }
    }
}