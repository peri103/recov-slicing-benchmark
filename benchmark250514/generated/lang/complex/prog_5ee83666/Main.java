import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Initialize ArrayList
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("Hello");
        wordsList.add("World");
        
        // Initialize HashMap
        HashMap<Integer, String> indexMap = new HashMap<>();
        indexMap.put(0, "Zero");
        indexMap.put(1, "One");
        
        // Perform operations on ArrayList
        for (String word : wordsList) {
            System.out.println("Word: " + word);
        }
        
        // Perform operations on HashMap
        for (Integer key : indexMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + indexMap.get(key));
        }
        
        // Modify StrBuilder
        /* write */ strBuilder.delete(5, 11); // Deletes " World"
        
        // Perform additional operations
        strBuilder.append(" Everyone");
        strBuilder.insert(0, "Greetings ");
        
        // More operations on ArrayList
        wordsList.add("Everyone");
        for (String word : wordsList) {
            System.out.println("Updated Word: " + word);
        }
        
        // Read the value from StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
        
        // Perform additional HashMap operations
        indexMap.put(2, "Two");
        for (Integer key : indexMap.keySet()) {
            System.out.println("Updated Key: " + key + ", Value: " + indexMap.get(key));
        }
    }
}