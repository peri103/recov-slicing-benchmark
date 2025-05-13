import java.util.ArrayList;
import java.util.HashMap;

public class TokenAnalyzer {
    private TokenProcessor tokenProcessor;

    public TokenAnalyzer(TokenProcessor tokenProcessor) {
        this.tokenProcessor = tokenProcessor;
    }

    public void analyzeTokens() {
        ArrayList<String> tokens = tokenProcessor.getTokens();
        HashMap<String, Integer> tokenCount = tokenProcessor.getTokenCount();

        int totalTokens = tokens.size();
        System.out.println("Total tokens: " + totalTokens);

        for (String token : tokens) {
            System.out.println("Token: " + token + ", Count: " + tokenCount.get(token));
        }
    }
}
