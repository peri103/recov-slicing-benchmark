import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("apple,,banana,,cherry");
        /* write */ tokenizer.setIgnoreEmptyTokens(true);
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}