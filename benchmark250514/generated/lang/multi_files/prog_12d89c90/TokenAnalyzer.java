import java.util.HashMap;
import java.util.List;

public class TokenAnalyzer {
    private HashMap<String, Integer> tokenCountMap = new HashMap<>();

    public void analyzeTokens(List<String> tokens) {
        for (String token : tokens) {
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }
    }

    public HashMap<String, Integer> getTokenCountMap() {
        return tokenCountMap;
    }

    public String getFirstToken(List<String> tokens) {
        /* read */ return tokens.get(0);
    }
}
