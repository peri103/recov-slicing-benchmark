import java.util.ArrayList;

public class TokenAnalyzer {
    private ArrayList<String> tokens;

    public TokenAnalyzer(ArrayList<String> tokens) {
        this.tokens = tokens;
    }

    public void analyzeTokens() {
        for (String token : tokens) {
            String upperToken = token.toUpperCase();
            System.out.println("Uppercase Token: " + upperToken);
        }
    }

    public String getFirstToken() {
        /* read */ return tokens.get(0);
    }
}
