import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class TokenProcessor {
    private StrTokenizer tokenizer;
    private ArrayList<String> tokensList = new ArrayList<>();
    private HashMap<String, Integer> tokenCountMap = new HashMap<>();

    public TokenProcessor(String input) {
        tokenizer = new StrTokenizer(input);
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());
    }

    public void processTokens() {
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokensList.add(token);
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }
    }

    public ArrayList<String> getTokensList() {
        return tokensList;
    }

    public HashMap<String, Integer> getTokenCountMap() {
        return tokenCountMap;
    }
}
