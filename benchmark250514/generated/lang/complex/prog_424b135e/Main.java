import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");

        // Initialize a map to store token counts
        Map<String, Integer> tokenCountMap = new HashMap<>();

        // Set the ignored character to a comma
        /* write */ tokenizer.setIgnoredChar(',');

        // Count the occurrences of each token
        String token;
        while (tokenizer.hasNext()) {
            token = tokenizer.nextToken();
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Perform some unrelated string operations
        String sampleString = "Hello, World!";
        String reversedString = StringUtils.reverse(sampleString);
        System.out.println("Reversed String: " + reversedString);

        // Print the token count map
        System.out.println("Token Count Map: " + tokenCountMap);

        // Reset the tokenizer for another reading
        tokenizer.reset();

        // Read the next token, which should be the first token before the ignored character was set
        /* read */ token = tokenizer.nextToken();

        // Print the token
        System.out.println("First Token: " + token);

        // Perform additional operations on the map
        for (Map.Entry<String, Integer> entry : tokenCountMap.entrySet()) {
            System.out.println("Token: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}