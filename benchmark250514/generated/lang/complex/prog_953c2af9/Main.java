import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Additional unrelated code to increase complexity
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More complex operations
        StrBuilder anotherStrBuilder = new StrBuilder("Goodbye World");
        anotherStrBuilder.append(" and Universe");
        
        // Modify original StrBuilder
        /* write */ strBuilder.replace(6, 11, "Java");
        
        // Perform operations on anotherStrBuilder
        anotherStrBuilder.insert(0, "Welcome ");
        anotherStrBuilder.delete(0, 8);
        System.out.println("Another StrBuilder: " + anotherStrBuilder.toString());

        // Additional unrelated operations
        String[] words = {"This", "is", "a", "test"};
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Retrieve and print the result from the original StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println("Final StrBuilder: " + result);
    }
}