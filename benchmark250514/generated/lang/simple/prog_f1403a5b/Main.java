import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with some content
        StrBuilder strBuilder = new StrBuilder("Hello, World!");

        // Use the deleteAll method to remove all occurrences of a substring
        /* write */ strBuilder.deleteAll("World");

        // Use the toString method to read the content of the StrBuilder
        /* read */ String result = strBuilder.toString();

        // Print the result to verify the operations
        System.out.println(result);
    }
}