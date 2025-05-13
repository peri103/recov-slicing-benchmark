import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("key", 0); // Initialize base map with a key to ensure fixed size map has a valid key
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println("Shuffled numbers: " + numbers);

        /* write */ fixedSizeMap.put("key", 42);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of shuffled numbers: " + sum);

        int max = Collections.max(numbers);
        System.out.println("Max number: " + max);

        /* read */ Integer value = fixedSizeMap.get("key");
        System.out.println(value);

        List<String> words = new ArrayList<>();
        Collections.addAll(words, "apple", "banana", "cherry", "date", "elderberry");
        Collections.sort(words);
        System.out.println("Sorted words: " + words);

        HashMap<String, String> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, word.toUpperCase());
        }
        System.out.println("Word map: " + wordMap);
    }
}