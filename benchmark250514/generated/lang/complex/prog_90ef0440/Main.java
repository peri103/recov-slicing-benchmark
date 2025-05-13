import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> stringLengths = new HashMap<>();

        // Add some strings to the list and map their lengths
        stringList.add("Java");
        stringList.add("Programming");
        stringList.add("Language");

        for (String str : stringList) {
            stringLengths.put(str, str.length());
        }

        // Perform operations on the StrBuilder
        /* write */ strBuilder.delete(0, 6);  // Deletes "Hello "
        
        // Working with the string list and map
        for (String str : stringList) {
            System.out.println("String: " + str + ", Length: " + stringLengths.get(str));
        }

        // More operations on StrBuilder
        strBuilder.append(" Universe");
        strBuilder.insert(0, "Greetings ");
        
        // Final read operation on StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        // Additional operations to increase complexity
        StrBuilder anotherStrBuilder = new StrBuilder("Complexity");
        anotherStrBuilder.replaceFirst('C', 'S');
        anotherStrBuilder.append(" Enhanced");
        System.out.println(anotherStrBuilder.toString());
    }
}