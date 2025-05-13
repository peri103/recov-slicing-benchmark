import org.apache.commons.lang3.text.StrTokenizer;

public class TokenProcessor {
    private StrTokenizer tokenizer;

    public TokenProcessor(String input) {
        tokenizer = new StrTokenizer(input);
    }

    public void setDelimiter(String delimiter) {
        /* write */ tokenizer.setDelimiterString(delimiter);
    }

    public String getNextToken() {
        return tokenizer.nextToken();
    }
}
