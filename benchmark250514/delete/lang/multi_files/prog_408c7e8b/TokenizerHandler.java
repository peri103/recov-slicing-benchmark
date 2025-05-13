import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class TokenizerHandler {
    private StrTokenizer tokenizer;

    public TokenizerHandler(String input) {
        tokenizer = new StrTokenizer(input);
    }

    public void setDelimiter(char delimiter) {
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(delimiter));
    }

    public StrTokenizer getTokenizer() {
        return tokenizer;
    }
}