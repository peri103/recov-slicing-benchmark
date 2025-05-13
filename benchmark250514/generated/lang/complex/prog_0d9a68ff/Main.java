import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with some content
        StrBuilder strBuilder = new StrBuilder("Initial content");

        // Create a complex data structure
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        HashMap<String, Integer> stringToLengthMap = new HashMap<>();
        for (String str : stringList) {
            stringToLengthMap.put(str, str.length());
        }

        // Perform some operations on the data structure
        for (Map.Entry<String, Integer> entry : stringToLengthMap.entrySet()) {
            System.out.println("String: " + entry.getKey() + ", Length: " + entry.getValue());
        }

        // Clear the StrBuilder
        /* write */ strBuilder.clear();

        // Add more strings to the ArrayList
        stringList.add("Another");
        stringList.add("String");

        // Update the map with new lengths
        for (String str : stringList) {
            stringToLengthMap.put(str, str.length());
        }

        // Perform some calculations
        int totalLength = 0;
        for (int length : stringToLengthMap.values()) {
            totalLength += length;
        }
        System.out.println("Total length of all strings: " + totalLength);

        // Read the content of StrBuilder
        /* read */ String value = strBuilder.toString();
        System.out.println("StrBuilder content: '" + value + "'"); // This will print an empty string since the builder was cleared

        // Additional operations
        int maxLength = 0;
        String longestString = "";
        for (String str : stringList) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longestString = str;
            }
        }
        System.out.println("Longest string: " + longestString + " with length: " + maxLength);
    }
}