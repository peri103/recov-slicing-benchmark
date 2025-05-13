import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a string to tokenize
        String str = "apple,banana,orange";

        // Initialize StrTokenizer with the string
        StrTokenizer tokenizer = new StrTokenizer(str);

        // Set the delimiter character to comma
        /* write */ tokenizer.setDelimiterChar(',');

        // Additional code to make the program more complex
        List<String> fruits = new ArrayList<>();
        StrTokenizer tempTokenizer = new StrTokenizer("grape;melon;berry");
        tempTokenizer.setDelimiterChar(';');
        while (tempTokenizer.hasNext()) {
            fruits.add(tempTokenizer.nextToken());
        }

        // Perform some operations on the list
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println("Fruit from list: " + fruit);
        }

        // Read the first token
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println("First token from tokenizer: " + token);

        // Further operations to increase complexity
        int totalLength = 0;
        for (String fruit : fruits) {
            totalLength += fruit.length();
        }
        System.out.println("Total length of all fruits: " + totalLength);

        // Modify and read from another StrTokenizer
        StrTokenizer anotherTokenizer = new StrTokenizer("kiwi-mango-pineapple");
        anotherTokenizer.setDelimiterChar('-');
        System.out.println("Tokens from another tokenizer:");
        while (anotherTokenizer.hasNext()) {
            System.out.println(anotherTokenizer.nextToken());
        }
    }
}