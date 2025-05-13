public class Main {
    public static void main(String[] args) {
        // Initialize TokenManager with input string
        TokenManager tokenManager = new TokenManager("apple,banana,orange");

        // Set the delimiter for the tokenizer
        tokenManager.setDelimiter(',');

        // Retrieve tokenizer and process tokens
        TokenProcessor tokenProcessor = new TokenProcessor(tokenManager.getTokenizer());
        
        String firstToken = tokenProcessor.processNextToken();
        /* read */ System.out.println("First token after delimiter set: " + firstToken);

        // Additional processing
        while (true) {
            String token = tokenProcessor.processNextToken();
            if (token == null) break;
            System.out.println("Processed token: " + token);
        }
    }
}