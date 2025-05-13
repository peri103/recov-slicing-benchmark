import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initializing StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer(",,", ',');

        // Performing operations on ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Manipulating the StrTokenizer object
        tokenizer.setIgnoreEmptyTokens(false);
        tokenizer.setDelimiterString(";");

        // Performing some operations on the ArrayList
        stringList.add("Apache");
        stringList.add("Commons");

        /* write */ tokenizer.setEmptyTokenAsNull(true);

        // Iterating over the ArrayList and printing each element
        for (String str : stringList) {
            System.out.println(str);
        }

        // Additional manipulation of the ArrayList
        stringList.remove("World");
        stringList.add("Lang");

        // More operations on StrTokenizer
        tokenizer.setTrimmerMatcher(StrTokenizer.DEFAULT_TRIMMER_MATCHER);
        
        // Some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        /* read */ String token = tokenizer.nextToken();
        System.out.println("Token: " + token);

        // Final operations on ArrayList
        for (String str : stringList) {
            System.out.println("Final List Element: " + str);
        }
    }
}