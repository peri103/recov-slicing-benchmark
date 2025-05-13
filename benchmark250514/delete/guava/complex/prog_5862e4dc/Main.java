import com.google.common.collect.EnumMultiset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        enum Color { RED, GREEN, BLUE }

        // Create an EnumMultiset for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Arrays.asList(Color.class.getEnumConstants()));

        // Add an element to the multiset
        /* write */ colorMultiset.add(Color.RED);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Create another EnumMultiset and perform operations
        EnumMultiset<Color> anotherMultiset = EnumMultiset.create(Arrays.asList(Color.class.getEnumConstants()));
        anotherMultiset.add(Color.GREEN);
        anotherMultiset.add(Color.BLUE);
        anotherMultiset.add(Color.BLUE);

        int greenCount = anotherMultiset.count(Color.GREEN);
        int blueCount = anotherMultiset.count(Color.BLUE);

        System.out.println("Green count in anotherMultiset: " + greenCount);
        System.out.println("Blue count in anotherMultiset: " + blueCount);

        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 natural numbers: " + product);

        // Read the count of the added element in the original multiset
        /* read */ int redCount = colorMultiset.count(Color.RED);

        // Output the count
        System.out.println("Red count in colorMultiset: " + redCount);

        // Additional logic to manipulate the original multiset
        colorMultiset.add(Color.GREEN);
        colorMultiset.add(Color.GREEN);
        int totalColors = colorMultiset.count(Color.RED) + colorMultiset.count(Color.GREEN) + colorMultiset.count(Color.BLUE);
        System.out.println("Total colors in colorMultiset: " + totalColors);
    }
}