import java.util.HashMap;
import org.apache.commons.lang3.text.StrTokenizer;

public class WordCounter {
    private HashMap<String, Integer> wordCount = new HashMap<>();

    public void processText(String text) {
        StrTokenizer tokenizer = new StrTokenizer(text);
        tokenizer.setDelimiterString(" ");
        
        while (tokenizer.hasNext()) {
            String word = tokenizer.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    public HashMap<String, Integer> getWordCount() {
        return wordCount;
    }
}
