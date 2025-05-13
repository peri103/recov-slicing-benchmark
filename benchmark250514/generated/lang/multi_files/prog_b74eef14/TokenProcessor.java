import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class TokenProcessor {
    private StrTokenizer tokenizer;
    private ArrayList<String> tokens = new ArrayList<>();
    private HashMap<String, Integer> tokenCount = new HashMap<>();

    public TokenProcessor(String input) {
        tokenizer = new StrTokenizer(input, ',');
        /* write */ tokenizer.setEmptyTokenAsNull(true);
    }

    public void processTokens() {
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokens.add(token);
            tokenCount.put(token, tokenCount.getOrDefault(token, 0) + 1);
        }
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }

    public HashMap<String, Integer> getTokenCount() {
        return tokenCount;
    }
}
