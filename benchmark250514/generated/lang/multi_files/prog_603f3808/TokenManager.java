import org.apache.commons.lang3.text.StrTokenizer;

public class TokenManager {
    private StrTokenizer tokenizer;

    public TokenManager(String input) {
        tokenizer = new StrTokenizer(input);
    }

    public void setDelimiter(char delimiter) {
        /* write */ tokenizer.setDelimiterChar(delimiter);
    }

    public StrTokenizer getTokenizer() {
        return tokenizer;
    }
}
