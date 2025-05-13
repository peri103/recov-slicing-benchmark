import java.util.HashMap;

public class WordCounter {
    private HashMap<String, Integer> wordFrequency = new HashMap<>();

    public void addWords(String[] words) {
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
    }

    public void printWordFrequencies() {
        System.out.println("Word Frequencies:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }
}
