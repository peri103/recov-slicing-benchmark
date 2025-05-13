import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with a string
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Initialize an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Reverse the string using StrBuilder
        /* write */ strBuilder.reverse();

        // Perform some operations on the ArrayList
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Convert StrBuilder to string
        /* read */ String reversedString = strBuilder.toString();
        System.out.println("Reversed string: " + reversedString);

        // More operations on the ArrayList
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);

        // Additional complex logic
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("cherry");

        StringBuilder concatenatedWords = new StringBuilder();
        for (String word : wordList) {
            concatenatedWords.append(word).append(" ");
        }
        System.out.println("Concatenated words: " + concatenatedWords.toString().trim());
    }
}