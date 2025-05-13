import java.util.ArrayList;
import java.util.HashMap;

public class TokenAnalyzer {
    private TokenProcessor processor;

    public TokenAnalyzer(TokenProcessor processor) {
        this.processor = processor;
    }

    public void displayTokenCounts() {
        HashMap<String, Integer> tokenCountMap = processor.getTokenCountMap();
        for (String key : tokenCountMap.keySet()) {
            System.out.println("Token: " + key + ", Count: " + tokenCountMap.get(key));
        }
    }

    public void displayTokens() {
        ArrayList<String> tokenList = processor.getTokenList();
        for (int i = 0; i < tokenList.size(); i++) {
            System.out.println("Token from list: " + tokenList.get(i));
        }
    }
}
