import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initial setup for StrTokenizer
        String input = "Hello,World";
        StrTokenizer tokenizer = new StrTokenizer(input, ',');

        // Using another StrTokenizer instance for demonstration
        String anotherInput = "A,B,C,D";
        StrTokenizer anotherTokenizer = new StrTokenizer(anotherInput, ',');
        while (anotherTokenizer.hasNext()) {
            System.out.println("Another Token: " + anotherTokenizer.nextToken());
        }

        // ArrayList demonstration
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Programming");
        stringList.add("Language");

        for (String str : stringList) {
            System.out.println("List Item: " + str);
        }

        // Reset the tokenizer with new input
        /* write */ tokenizer.reset("Java,Programming");

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Additional manipulation of ArrayList
        stringList.add("Tutorial");
        stringList.remove("Language");
        for (String str : stringList) {
            System.out.println("Updated List Item: " + str);
        }

        // Read the next token from the tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}