import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ArrayList<String> stringList = new ArrayList<>();
        Map<String, Integer> wordCount = new HashMap<>();
        
        try {
            DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(byteArrayOutputStream);
            
            byte[] dictionary = {1, 2, 3, 4, 5};
            /* write */ deflateStream.setDictionary(dictionary);
            
            // Add some words to the list
            stringList.add("apple");
            stringList.add("banana");
            stringList.add("apple");
            stringList.add("orange");
            stringList.add("banana");
            stringList.add("banana");
            
            // Count the occurrences of each word
            for (String word : stringList) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            
            // Print the word count
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
            }
            
            // Perform some complex operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);
            
            /* read */ byte[] readDictionary = deflateStream.getDictionary();
            for (byte b : readDictionary) {
                System.out.print(b + " ");
            }
            
            deflateStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}