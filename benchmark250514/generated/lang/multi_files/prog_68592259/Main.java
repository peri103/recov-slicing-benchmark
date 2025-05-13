public class Main {
    public static void main(String[] args) {
        // Process a string to tokenize and analyze
        TokenProcessor processor = new TokenProcessor("  Hello, World!  ");
        processor.processTokens();

        // Analyze the tokens
        TokenAnalyzer analyzer = new TokenAnalyzer(processor.getTokens());
        analyzer.analyzeTokens();

        // Get and print the first token
        String firstToken = analyzer.getFirstToken();
        System.out.println("First Token: " + firstToken);
    }
}