import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class TokenProcessor {
    private StrTokenizer tokenizer;
    private ArrayList<String> tokenList = new ArrayList<>();
    private HashMap<String, Integer> tokenCountMap = new HashMap<>();

    public TokenProcessor(String input, char delimiter) {
        tokenizer = new StrTokenizer(input, delimiter);
        /* write */ tokenizer.setEmptyTokenAsNull(true);
    }

    public void processTokens() {
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            if (token != null) {
                tokenList.add(token);
                tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
            }
        }
    }

    public ArrayList<String> getTokenList() {
        return tokenList;
    }

    public HashMap<String, Integer> getTokenCountMap() {
        return tokenCountMap;
    }
}
