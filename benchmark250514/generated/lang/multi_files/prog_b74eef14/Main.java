import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "Hello,,World";
        TokenProcessor tokenProcessor = new TokenProcessor(input);
        tokenProcessor.processTokens();

        TokenAnalyzer tokenAnalyzer = new TokenAnalyzer(tokenProcessor);
        tokenAnalyzer.analyzeTokens();

        ArrayList<String> tokens = tokenProcessor.getTokens();
        /* read */ String firstToken = tokens.get(0);
        System.out.println("First token from original tokenizer: " + firstToken);

        // Further unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}