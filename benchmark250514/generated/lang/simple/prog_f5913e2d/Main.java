import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with some content
        StrBuilder strBuilder = new StrBuilder("Hello World");

        // Perform the write operation: delete character at index 5 (space)
        /* write */ strBuilder.deleteCharAt(5);

        // Perform the read operation: convert the StrBuilder to a String
        /* read */ String result = strBuilder.toString();

        // Print the result to verify the operations
        System.out.println(result);
    }
}