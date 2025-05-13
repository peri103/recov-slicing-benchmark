import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<String> stringList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            stringList.add("String" + i);
        }
        
        // Manipulating the StrBuilder
        StrBuilder additionalStrBuilder = new StrBuilder("Additional Text");
        additionalStrBuilder.append(" - Appended");

        // Perform some operations on the ArrayList
        for (String s : stringList) {
            System.out.println("Processing: " + s);
        }

        // Adding an element from StrBuilder to ArrayList
        stringList.add(additionalStrBuilder.toString());

        // Perform some operations on the StrBuilder
        StrBuilder transformedStrBuilder = new StrBuilder();
        for (String s : stringList) {
            transformedStrBuilder.append(s).append(" | ");
        }
        
        // Original write-read pair
        /* write */ StrBuilder result = strBuilder.substring(0, 5);
        
        // Further operations on transformedStrBuilder
        transformedStrBuilder.append("End of List");
        
        // Original read operation
        /* read */ String value = result.toString();
        System.out.println(value);

        // Final output from transformedStrBuilder
        System.out.println(transformedStrBuilder.toString());
    }
}