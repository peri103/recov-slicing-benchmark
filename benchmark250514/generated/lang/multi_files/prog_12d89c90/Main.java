import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize TokenProcessor with a sample input
        TokenProcessor processor = new TokenProcessor("Hello,World,Java");

        // Set the delimiter and process tokens
        processor.setDelimiter(",");
        processor.processTokens();

        // Retrieve processed tokens
        ArrayList<String> tokens = processor.getTokenList();

        // Initialize TokenAnalyzer and analyze tokens
        TokenAnalyzer analyzer = new TokenAnalyzer();
        analyzer.analyzeTokens(tokens);

        // Retrieve the first token
        String firstToken = analyzer.getFirstToken(tokens);

        // Print the first token
        System.out.println("First Token: " + firstToken);

        // Print all tokens and their counts
        System.out.println("All Tokens and Counts:");
        for (String token : analyzer.getTokenCountMap().keySet()) {
            System.out.println("Token: " + token + ", Count: " + analyzer.getTokenCountMap().get(token));
        }
    }
}