import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        String input = "Hello,,World";
        StrTokenizer tokenizer = new StrTokenizer(input, ',');
        
        /* write */ tokenizer.setEmptyTokenAsNull(true);
        
        /* read */ String token1 = tokenizer.nextToken();
        System.out.println(token1); // Output: "Hello"
        
        /* read */ String token2 = tokenizer.nextToken();
        System.out.println(token2); // Output: "null"
        
        /* read */ String token3 = tokenizer.nextToken();
        System.out.println(token3); // Output: "World"
    }
}