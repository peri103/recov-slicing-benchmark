public class Main {
    public static void main(String[] args) {
        // Initialize TokenizerHandler with a sample string
        TokenizerHandler handler = new TokenizerHandler("apple,banana,orange");

        // Set the delimiter to comma
        handler.setDelimiter(',');

        // Retrieve the tokenizer from handler
        StrTokenizer tokenizer = handler.getTokenizer();

        // Initialize TokenProcessor with the tokenizer
        TokenProcessor processor = new TokenProcessor(tokenizer);

        // Process the first token
        String firstToken = processor.processNextToken();
        System.out.println("First Token: " + firstToken);

        // Process remaining tokens
        processor.processAllTokens();

        // Additional unrelated computations
        double result = Math.pow(5, 2) + Math.sqrt(5);
        System.out.println("Complex Calculation Result: " + result);
    }
}