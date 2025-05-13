import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        ArrayList<String> stringList = new ArrayList<>();
        
        // Add some elements to the list
        stringList.add("First");
        stringList.add("Second");
        
        // Modify the StrBuilder
        /* write */ strBuilder.replaceFirst("World", "Java");
        
        // Perform some operations on the list
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Element " + i + ": " + stringList.get(i));
        }
        
        // Add more elements to the list
        stringList.add("Third");
        stringList.add("Fourth");
        
        // Transform the list elements and print them
        for (int i = 0; i < stringList.size(); i++) {
            String transformed = stringList.get(i).toUpperCase();
            System.out.println("Transformed Element " + i + ": " + transformed);
        }
        
        // Read from the StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
        
        // Perform additional operations on StrBuilder
        strBuilder.append(" is awesome!");
        System.out.println(strBuilder.toString());
        
        // Create another StrBuilder and perform operations
        StrBuilder anotherStrBuilder = new StrBuilder("Learning Java");
        anotherStrBuilder.append(" is fun!");
        System.out.println(anotherStrBuilder.toString());
    }
}