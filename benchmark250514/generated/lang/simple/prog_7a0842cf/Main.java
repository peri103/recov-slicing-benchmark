import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder object
        StrBuilder strBuilder = new StrBuilder("Hello, World!");

        // Use the substring method to modify the StrBuilder
        /* write */ strBuilder.substring(0, 5);

        // Use the toString method to read the value
        /* read */ String value = strBuilder.toString();

        // Print the value
        System.out.println(value);
    }
}