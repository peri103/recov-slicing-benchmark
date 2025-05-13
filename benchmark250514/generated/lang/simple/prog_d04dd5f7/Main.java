import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");
        
        // Set the delimiter character to ','
        /* write */ tokenizer.setDelimiterChar(',');
        
        // Read the first token
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token
        System.out.println(token);
    }
}