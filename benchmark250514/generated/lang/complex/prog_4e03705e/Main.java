import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String input = "value1,value2,value3";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        /* write */ tokenizer.setDelimiterString(",");
        
        // Unrelated code to make the program more complex
        String[] tokens = StringUtils.split(input, ",");
        for (String token : tokens) {
            System.out.println("Token: " + token);
        }
        
        // Additional logic using StrTokenizer without marking
        StrTokenizer anotherTokenizer = new StrTokenizer("apple|banana|cherry", '|');
        while (anotherTokenizer.hasNext()) {
            String fruit = anotherTokenizer.nextToken();
            System.out.println("Fruit: " + fruit);
        }
        
        // More complex logic involving string manipulation
        String reversedInput = StringUtils.reverse(input);
        System.out.println("Reversed Input: " + reversedInput);
        
        // Using StringUtils to check if a string is numeric
        boolean isNumeric = StringUtils.isNumeric("12345");
        System.out.println("Is Numeric: " + isNumeric);
        
        // More unrelated logic
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println(token);
    }
}