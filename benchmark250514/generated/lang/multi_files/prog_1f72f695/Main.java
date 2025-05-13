import java.util.List;

public class Main {
    public static void main(String[] args) {
        TokenProcessor processor = new TokenProcessor("Hello, World! This is a test.");
        processor.ignoreCharacter(',');

        // Get the tokens after ignoring commas
        List<String> tokens = processor.getTokens();

        // Analyze the tokens
        TokenAnalyzer analyzer = new TokenAnalyzer(tokens);
        int totalLength = analyzer.calculateTotalLength();
        System.out.println("Total length of tokens: " + totalLength);

        // Reinitialize processor to demonstrate the original read operation
        processor = new TokenProcessor("Hello, World! This is a test.");
        processor.ignoreCharacter(',');

        // Read the first token
        List<String> newTokens = processor.getTokens();
        /* read */ String firstToken = newTokens.get(0);
        System.out.println("First token after ignoring commas: " + firstToken);

        // Additional unrelated code for complexity
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 2;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}