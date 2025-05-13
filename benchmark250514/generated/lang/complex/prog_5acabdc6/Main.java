import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer();
        
        // Initialize another tokenizer for demonstration
        StrTokenizer anotherTokenizer = new StrTokenizer("Java,Programming,Language");

        // Demonstrate the use of StringUtils for complex string manipulation
        String complexString = "Hello,World,Java,Programming";
        String[] splitArray = StringUtils.split(complexString, ',');
        for (String str : splitArray) {
            System.out.println("Split part: " + str);
        }

        // Reset the tokenizer with a new string
        /* write */ tokenizer.reset("Hello,World");
        
        // Perform some operations with another tokenizer
        if (anotherTokenizer.hasNext()) {
            String anotherToken = anotherTokenizer.nextToken();
            System.out.println("Another token: " + anotherToken);
        }

        // Complex loop to manipulate tokens
        for (int i = 0; i < splitArray.length; i++) {
            System.out.println("Token from split array: " + splitArray[i]);
            if (i == 2) {
                System.out.println("Special token found at index 2: " + splitArray[i]);
            }
        }

        // Read the token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token from tokenizer: " + token);

        // Additional string manipulation using StringUtils
        String reversedString = StringUtils.reverse(complexString);
        System.out.println("Reversed string: " + reversedString);
    }
}