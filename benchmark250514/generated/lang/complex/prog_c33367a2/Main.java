import org.apache.commons.lang3.text.StrBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original StrBuilder usage
        StrBuilder strBuilder = new StrBuilder();
        /* write */ strBuilder.appendSeparator(", ", "Hello");

        // Additional complex code
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = {"Hello", "World", "Hello", "Java", "World"};
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        StrBuilder anotherStrBuilder = new StrBuilder();
        anotherStrBuilder.append("Initial text");
        anotherStrBuilder.appendSeparator(" - ");
        anotherStrBuilder.append("More text");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Original StrBuilder read
        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        // Additional StrBuilder usage
        anotherStrBuilder.appendSeparator(" | ");
        anotherStrBuilder.append("Final text");
        String finalResult = anotherStrBuilder.toString();
        System.out.println(finalResult);
    }
}