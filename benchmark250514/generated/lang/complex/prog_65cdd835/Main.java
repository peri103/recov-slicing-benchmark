import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset();

        // Additional complexity: Use StringUtils to manipulate strings
        String sample = "Apache,Commons,Lang";
        String[] words = StringUtils.split(sample, ",");

        // Process each word and store in a StringBuilder
        StringBuilder processedWords = new StringBuilder();
        for (String word : words) {
            processedWords.append(word.toUpperCase()).append(" ");
        }

        // Print the processed string
        System.out.println(processedWords.toString().trim());

        // Read the first token from the tokenizer
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token to verify the read operation
        System.out.println(token);

        // Further complexity: Reverse each word and store in a new array
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = new StringBuilder(words[i]).reverse().toString();
        }

        // Print each reversed word
        for (String reversedWord : reversedWords) {
            System.out.println(reversedWord);
        }
    }
}