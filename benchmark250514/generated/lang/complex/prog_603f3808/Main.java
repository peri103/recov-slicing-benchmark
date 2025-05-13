import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String input = "apple,banana,orange";
        StrTokenizer tokenizer = new StrTokenizer(input);

        // Additional unrelated code to make the program more complex
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Use another instance of StrTokenizer with a different delimiter
        StrTokenizer anotherTokenizer = new StrTokenizer("dog|cat|mouse", '|');
        while (anotherTokenizer.hasNext()) {
            System.out.println("Animal: " + anotherTokenizer.nextToken());
        }

        // String manipulation using Apache Commons Lang
        String reversedInput = StringUtils.reverse(input);
        System.out.println("Reversed input: " + reversedInput);

        /* write */ tokenizer.setDelimiterChar(',');
        
        // Code for processing the input string
        int tokenCount = 0;
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            System.out.println("Token " + tokenCount + ": " + token);
            tokenCount++;
        }

        // More complex string manipulation
        String joinedString = StringUtils.join(fruits, "-");
        System.out.println("Joined string: " + joinedString);

        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println("First token after delimiter set: " + firstToken);
    }
}