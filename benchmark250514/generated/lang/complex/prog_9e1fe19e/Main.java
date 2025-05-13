import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<Integer> numberList = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        // Populate numberList with some values
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 5);
        }
        
        // Count the number of occurrences of each character in the initial string
        for (char c : strBuilder.toString().toCharArray()) {
            String charStr = String.valueOf(c);
            wordCount.put(charStr, wordCount.getOrDefault(charStr, 0) + 1);
        }
        
        // Output the word count map
        System.out.println("Character count before clear:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
        
        /* write */ strBuilder.clear();
        
        // Add some complex operations with numberList
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        
        // Output the sum of the numberList
        System.out.println("Sum of numberList: " + sum);
        
        // Add more elements to wordCount
        wordCount.put("new", 3);
        wordCount.put("entries", 2);
        
        // Output the modified word count map
        System.out.println("Modified Character count:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
        
        /* read */ String value = strBuilder.toString();
        System.out.println("StrBuilder after clear: '" + value + "'");
    }
}