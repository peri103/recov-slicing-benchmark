import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Additional manipulation using StrBuilder
        StrBuilder additionalBuilder = new StrBuilder("Java Programming");
        additionalBuilder.append(" is fun!");
        System.out.println(additionalBuilder.toString());
        
        // Use StringUtils for some operations
        String reversed = StringUtils.reverse("Hello");
        System.out.println("Reversed: " + reversed);

        // Write operation
        /* write */ strBuilder.deleteAll("World");
        
        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More operations on StrBuilder
        additionalBuilder.insert(5, " Language");
        System.out.println(additionalBuilder.toString());
        
        // Read operation
        /* read */ String result = strBuilder.toString();
        System.out.println("Result after deletion: " + result);
        
        // Further unrelated operations
        String joinedString = StringUtils.join(numbers, ", ");
        System.out.println("Joined string: " + joinedString);
    }
}