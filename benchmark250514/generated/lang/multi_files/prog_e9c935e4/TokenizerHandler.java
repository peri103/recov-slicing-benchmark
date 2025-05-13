import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class TokenizerHandler {
    private StrTokenizer tokenizer;

    public TokenizerHandler(String input) {
        this.tokenizer = new StrTokenizer(input);
    }

    public void configureTokenizer() {
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.spaceMatcher());
    }

    public StrTokenizer getTokenizer() {
        return tokenizer;
    }
}
