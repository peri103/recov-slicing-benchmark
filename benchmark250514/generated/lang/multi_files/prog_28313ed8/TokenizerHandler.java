import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class TokenizerHandler {
    private StrTokenizer tokenizer;

    public TokenizerHandler(String input) {
        this.tokenizer = new StrTokenizer(input);
    }

    public void ignoreCommas() {
        StrMatcher commaMatcher = StrMatcher.charMatcher(',');
        /* write */ tokenizer.setIgnoredMatcher(commaMatcher);
    }

    public String getNextToken() {
        /* read */ return tokenizer.nextToken();
    }
}