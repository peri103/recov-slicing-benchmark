import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        StrBuilder anotherStrBuilder = new StrBuilder();
        
        // Adding separators to the original StrBuilder
        /* write */ strBuilder.appendSeparator(",");
        
        // Adding some text to another StrBuilder
        anotherStrBuilder.append("Hello");
        anotherStrBuilder.appendSeparator("-");
        anotherStrBuilder.append("World");
        
        // Performing some operations on the second StrBuilder
        String anotherResult = anotherStrBuilder.toString();
        System.out.println("Another StrBuilder: " + anotherResult);
        
        // Manipulating the original StrBuilder further
        strBuilder.append("First");
        strBuilder.appendSeparator(",");
        strBuilder.append("Second");
        
        // Some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Reading the value from the original StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println("Original StrBuilder: " + result);
        
        // Adding more content to the second StrBuilder
        anotherStrBuilder.appendSeparator("-");
        anotherStrBuilder.append("Again");
        
        // Display the updated second StrBuilder
        anotherResult = anotherStrBuilder.toString();
        System.out.println("Updated Another StrBuilder: " + anotherResult);
    }
}