import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello World");
        StrMatcher matcher = StrMatcher.charMatcher(' ');

        ArrayList<String> tokensList = new ArrayList<>();
        tokensList.add("Initial Token");

        /* write */ tokenizer.setTokenMatcher(matcher);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        String reversed = StringUtils.reverse("Complexity");
        System.out.println("Reversed string: " + reversed);

        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);

        tokensList.add(token);

        int lengthSum = 0;
        for (String str : tokensList) {
            lengthSum += str.length();
        }
        System.out.println("Total length of tokens: " + lengthSum);

        StrTokenizer tokenizer2 = new StrTokenizer("Java Programming");
        tokenizer2.setTokenMatcher(StrMatcher.charMatcher(' '));

        while (tokenizer2.hasNext()) {
            String nextToken = tokenizer2.nextToken();
            System.out.println("Next token: " + nextToken);
        }
    }
}