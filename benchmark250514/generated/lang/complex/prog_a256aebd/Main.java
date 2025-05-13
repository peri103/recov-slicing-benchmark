import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String input = "Hello,World";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        /* write */ tokenizer.setDelimiterChar(',');

        // Additional unrelated code
        String reversedInput = StringUtils.reverse(input);
        System.out.println("Reversed Input: " + reversedInput);

        // Using another StrTokenizer instance
        StrTokenizer anotherTokenizer = new StrTokenizer(reversedInput);
        anotherTokenizer.setDelimiterChar('o');
        while (anotherTokenizer.hasNext()) {
            System.out.println("Another Token: " + anotherTokenizer.nextToken());
        }

        // Some more complex logic
        int sum = 0;
        for (char c : input.toCharArray()) {
            sum += c;
        }
        System.out.println("Sum of ASCII values: " + sum);

        // Logic that involves string manipulation
        String[] parts = StringUtils.split(input, ',');
        for (String part : parts) {
            System.out.println("Part: " + part);
        }

        /* read */ String token = tokenizer.nextToken();
        System.out.println("Token: " + token);
    }
}