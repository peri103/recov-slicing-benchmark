import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("example");

        // Set a token character
        /* write */ tokenizer.setTokenChar('x');

        // Adding complexity: Using a HashMap to store tokens
        HashMap<String, Integer> tokenMap = new HashMap<>();
        
        // Populate the HashMap with some values
        tokenMap.put("example", 1);
        tokenMap.put("test", 2);
        tokenMap.put("token", 3);

        // Using ArrayList to store some data
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("data1");
        dataList.add("data2");
        dataList.add("data3");

        // Perform operations on ArrayList
        for (String data : dataList) {
            System.out.println("Processing: " + data);
        }

        // Read the next token
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println("Token: " + token);

        // More operations with HashMap
        for (String key : tokenMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + tokenMap.get(key));
        }

        // Perform some calculations
        int sum = 0;
        for (int value : tokenMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in tokenMap: " + sum);
    }
}