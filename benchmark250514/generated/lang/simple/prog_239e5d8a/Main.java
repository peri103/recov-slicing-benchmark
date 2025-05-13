import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("one,two,three");
        
        // Set the delimiter character to ','
        /* write */ tokenizer.setDelimiterChar(',');

        // Read the first token
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println(token);
    }
}