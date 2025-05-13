import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class TokenProcessor {
    private StrTokenizer tokenizer;

    public TokenProcessor(String input) {
        tokenizer = new StrTokenizer(input);
    }

    public void configureTokenizer() {
        /* write */ tokenizer.setTokenMatcher(StrMatcher.commaMatcher());
    }

    public StrTokenizer getTokenizer() {
        return tokenizer;
    }
}
