import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        StrBuilder anotherBuilder = new StrBuilder();
        
        // Adding some content to anotherBuilder
        anotherBuilder.append("Hello");
        anotherBuilder.appendSeparator(", ");
        anotherBuilder.append("World!");

        // Adding more content to strBuilder
        strBuilder.append("Initial Content");
        
        // Additional logic to manipulate strBuilder
        for (int i = 0; i < 5; i++) {
            strBuilder.appendSeparator(", ");
            strBuilder.append("Item " + i);
        }

        // Some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        /* write */ strBuilder.appendSeparator(", ");
        
        // Further manipulation of strBuilder
        strBuilder.append("End Content");
        
        // Unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Using anotherBuilder
        System.out.println("Another Builder Content: " + anotherBuilder.toString());

        // Final read operation
        String result = strBuilder.toString();
        /* read */ System.out.println(result);
    }
}