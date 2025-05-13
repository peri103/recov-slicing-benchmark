import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset();

        // Additional code to make the program more complex
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        for (String language : list) {
            map.put(language, language.length());
        }

        for (String key : map.keySet()) {
            System.out.println("Language: " + key + ", Length: " + map.get(key));
        }

        // Perform operations on the list
        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            sb.append(item).append(" ");
        }
        System.out.println("Concatenated languages: " + sb.toString());

        // Read the first token from the tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println("First token: " + token);

        // Further operations
        int totalLength = 0;
        for (String language : list) {
            totalLength += language.length();
        }
        System.out.println("Total length of all languages: " + totalLength);
    }
}