import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        ArrayList<String> stringList = new ArrayList<>();
        
        // Add some strings to the list
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        
        // Process the list
        for (String str : stringList) {
            System.out.println("Processing: " + str);
        }
        
        // Perform operations on the StrBuilder
        strBuilder.append("!");
        strBuilder.insert(0, "Greeting: ");
        
        // Modify the StrBuilder
        /* write */ strBuilder.deleteCharAt(5); // Deletes the space between "Greeting:" and "Hello"
        
        // Further operations on the list
        stringList.add("Fourth");
        stringList.remove(1); // Remove "Second"
        
        // More complex operations
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).toUpperCase());
        }
        
        // Output the final result from StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result); // Outputs "Greetng:Hello World!"
        
        // Print the modified list
        System.out.println("Modified List: " + stringList);
    }
}