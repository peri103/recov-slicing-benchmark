public class Main {
    public static void main(String[] args) {
        TokenProcessor tokenProcessor = new TokenProcessor("Hello,World");
        tokenProcessor.setDelimiter(",");

        WordCounter wordCounter = new WordCounter();
        wordCounter.processText("Hello World Hello Universe");

        // Unrelated logical operations
        int a = 5, b = 10;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum + ", Product: " + product);

        /* read */ String firstToken = tokenProcessor.getNextToken();
        System.out.println("First token: " + firstToken);

        // Display word count
        System.out.println("Word counts: " + wordCounter.getWordCount());
    }
}