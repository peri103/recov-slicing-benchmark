import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class TokenProcessor {
    private StrTokenizer tokenizer;
    private ArrayList<String> tokens = new ArrayList<>();

    public TokenProcessor(String input) {
        tokenizer = new StrTokenizer(input);
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
    }

    public void processTokens() {
        while (tokenizer.hasNext()) {
            tokens.add(tokenizer.nextToken());
        }
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }
}
