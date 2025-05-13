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

        // Perform some operations on the list
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("List element: " + stringList.get(i));
        }

        // Reverse the StrBuilder content
        /* write */ strBuilder.reverse();

        // Perform more operations on the list
        stringList.add("Fourth");
        stringList.add("Fifth");

        // Print all elements in the list
        for (String s : stringList) {
            System.out.println("Updated list element: " + s);
        }

        // Retrieve the reversed string
        /* read */ String reversedString = strBuilder.toString();
        System.out.println("Reversed String: " + reversedString);

        // Additional operations with StrBuilder
        StrBuilder additionalBuilder = new StrBuilder("Additional");
        additionalBuilder.append(" Operations");
        System.out.println("Additional StrBuilder: " + additionalBuilder.toString());
    }
}