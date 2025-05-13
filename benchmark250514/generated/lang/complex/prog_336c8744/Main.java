import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");
        /* write */ tokenizer.setIgnoredChar(',');

        // Additional logic using StringUtils
        String str = "Hello, World!";
        boolean isAlpha = StringUtils.isAlpha(str);
        System.out.println("Is the string alphabetic? " + isAlpha);

        // Adding more complexity with a list
        ArrayList<String> tokensList = new ArrayList<>();
        tokensList.add("First");
        tokensList.add("Second");
        tokensList.add("Third");

        for (String s : tokensList) {
            System.out.println("List item: " + s);
        }

        // Processing the tokenizer
        while (tokenizer.hasNext()) {
            String next = tokenizer.nextToken();
            System.out.println("Token: " + next);
        }

        // Re-initializing tokenizer for further demonstration
        tokenizer = new StrTokenizer("x,y,z");
        tokenizer.setIgnoredChar('y');
        
        // More unrelated logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // Continue with the original read operation
        tokenizer = new StrTokenizer("apple,banana,grape");
        tokenizer.setIgnoredChar(',');
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}