import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with some content
        StrBuilder strBuilder = new StrBuilder("Hello World!");

        // Use the write method to delete a part of the string
        /* write */ strBuilder.delete(5, 11);

        // Use the read method to get the current state of the string
        /* read */ String result = strBuilder.toString();

        // Print the result
        System.out.println(result);
    }
}