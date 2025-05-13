import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Apache,Commons");

        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        // Create a HashMap and put some key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset();

        // Perform operations on the ArrayList
        for (String lang : list) {
            System.out.println("Language: " + lang);
        }

        // Perform operations on the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Retrieve the first token from the tokenizer
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println("First Token: " + firstToken);

        // Further operations on the tokenizer
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            System.out.println("Next Token: " + token);
        }

        // Add more elements to the ArrayList
        list.add("C++");
        list.add("Ruby");

        // Print all elements in the ArrayList
        for (String lang : list) {
            System.out.println("Updated Language List: " + lang);
        }
    }
}