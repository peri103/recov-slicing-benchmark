import org.apache.commons.lang3.text.StrBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original StrBuilder usage
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        /* write */ strBuilder.setLength(5);

        // Additional code to make the program more complex
        Map<String, Integer> wordCountMap = new HashMap<>();
        wordCountMap.put("Hello", 1);
        wordCountMap.put("World", 2);

        // Simulate some processing
        int totalWords = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            totalWords += entry.getValue();
        }

        // More StrBuilder manipulations
        StrBuilder anotherStrBuilder = new StrBuilder("Goodbye, World!");
        anotherStrBuilder.append(" Have a nice day.");
        System.out.println(anotherStrBuilder.toString());

        // Final read operation from the original StrBuilder
        /* read */ String value = strBuilder.toString();
        System.out.println(value);

        // Additional operations to increase complexity
        if (totalWords > 2) {
            strBuilder.append("!");
        }

        System.out.println("Total words counted: " + totalWords);
        System.out.println("Final StrBuilder content: " + strBuilder.toString());
    }
}