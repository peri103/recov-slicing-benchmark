import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.List;

public class TokenProcessor {
    private StrTokenizer tokenizer;

    public TokenProcessor(String input) {
        tokenizer = new StrTokenizer(input);
    }

    public void ignoreCharacter(char character) {
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.charMatcher(character));
    }

    public List<String> getTokens() {
        List<String> tokens = new ArrayList<>();
        while (tokenizer.hasNext()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }
}
