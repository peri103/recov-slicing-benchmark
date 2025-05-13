import java.util.List;

public class TokenAnalyzer {
    private List<String> tokens;

    public TokenAnalyzer(List<String> tokens) {
        this.tokens = tokens;
    }

    public int calculateTotalLength() {
        int totalLength = 0;
        for (String token : tokens) {
            totalLength += token.length();
        }
        return totalLength;
    }
}
