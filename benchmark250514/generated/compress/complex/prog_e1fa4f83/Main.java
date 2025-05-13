import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a CpioArchiveEntry
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.CPIO_TRAILER, 1000);
        /* write */ entry.setName("exampleName");

        // Additional code to increase complexity
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        
        // Count frequency of each word
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Print the frequency map
        for (Map.Entry<String, Integer> entrySet : frequencyMap.entrySet()) {
            System.out.println("Word: " + entrySet.getKey() + ", Frequency: " + entrySet.getValue());
        }

        // Further processing
        int maxFrequency = 0;
        String mostFrequentWord = null;
        
        for (Map.Entry<String, Integer> entrySet : frequencyMap.entrySet()) {
            if (entrySet.getValue() > maxFrequency) {
                maxFrequency = entrySet.getValue();
                mostFrequentWord = entrySet.getKey();
            }
        }

        System.out.println("Most Frequent Word: " + mostFrequentWord);

        // Using the original read method
        /* read */ String name = entry.getName();
        System.out.println("CpioArchiveEntry Name: " + name);

        // More unrelated complexity
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
    }
}