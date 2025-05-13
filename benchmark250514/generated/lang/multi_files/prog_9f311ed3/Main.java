public class Main {
    public static void main(String[] args) {
        TokenProcessor processor = new TokenProcessor("a,b,c", ',');
        processor.processTokens();

        TokenAnalyzer analyzer = new TokenAnalyzer(processor);
        analyzer.displayTokenCounts();
        analyzer.displayTokens();

        // Reset tokenizer and process again to demonstrate read
        processor = new TokenProcessor("a,b,c", ',');
        /* read */ String firstToken = processor.getTokenList().get(0);
        System.out.println("First token: " + firstToken);
    }
}