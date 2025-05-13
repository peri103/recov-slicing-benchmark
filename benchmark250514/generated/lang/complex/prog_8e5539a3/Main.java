import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Programming");
        words.add("Language");

        for (String word : words) {
            strBuilder.append(" ").append(word);
        }

        /* write */ strBuilder.deleteCharAt(5);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        StringBuilder reversedString = new StringBuilder();
        for (int i = strBuilder.length() - 1; i >= 0; i--) {
            reversedString.append(strBuilder.charAt(i));
        }
        System.out.println("Reversed String: " + reversedString);

        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}