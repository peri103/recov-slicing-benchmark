import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder object
        StrBuilder strBuilder = new StrBuilder();
        
        // Append separator to the StrBuilder
        /* write */ strBuilder.appendSeparator(",");
        
        // Convert StrBuilder to String and read the value
        /* read */ String result = strBuilder.toString();
        
        // Print the result
        System.out.println(result);
    }
}