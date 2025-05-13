import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with some text
        StrBuilder strBuilder = new StrBuilder("Hello World");

        // Initialize an ArrayList to store some data
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");

        // Initialize a HashMap to store key-value pairs
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        // Perform some operations on the ArrayList
        for (String s : stringList) {
            System.out.println("ArrayList element: " + s);
        }

        // Perform some operations on the HashMap
        for (Integer key : map.keySet()) {
            System.out.println("HashMap key-value pair: " + key + " - " + map.get(key));
        }

        // Modify the StrBuilder by clearing its content
        /* write */ strBuilder.clear();

        // Add new content to StrBuilder after clearing
        strBuilder.append("New Content");

        // Perform more operations on ArrayList
        stringList.add("Third");
        stringList.remove("Second");

        // Perform more operations on HashMap
        map.put(3, "Three");
        map.remove(1);

        // Final operations to read the StrBuilder content
        /* read */ String value = strBuilder.toString();
        System.out.println("StrBuilder content: " + value);

        // Final operations to print updated ArrayList
        for (String s : stringList) {
            System.out.println("Updated ArrayList element: " + s);
        }

        // Final operations to print updated HashMap
        for (Integer key : map.keySet()) {
            System.out.println("Updated HashMap key-value pair: " + key + " - " + map.get(key));
        }
    }
}