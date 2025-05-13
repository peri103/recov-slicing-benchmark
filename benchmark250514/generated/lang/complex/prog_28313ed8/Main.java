import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello, World!");
        StrTokenizer tokenizer2 = new StrTokenizer("Java, Python, C++");

        // Create a StrMatcher that matches commas
        StrMatcher commaMatcher = StrMatcher.charMatcher(',');

        // Use the write method to set the ignored matcher to ignore commas
        /* write */ tokenizer.setIgnoredMatcher(commaMatcher);

        // Additional code to demonstrate complexity
        ArrayList<String> languages = new ArrayList<>();
        HashMap<String, Integer> languagePopularity = new HashMap<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        languagePopularity.put("Java", 1);
        languagePopularity.put("Python", 2);
        languagePopularity.put("C++", 3);

        for (String language : languages) {
            int popularity = languagePopularity.get(language);
            System.out.println(language + " has popularity rank: " + popularity);
        }

        // Use the read method to get the next token, which should be "Hello"
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println(token);

        // Additional operations on tokenizer2
        tokenizer2.setIgnoredMatcher(commaMatcher);
        while (tokenizer2.hasNext()) {
            String langToken = tokenizer2.nextToken();
            System.out.println("Language: " + langToken);
        }
    }
}