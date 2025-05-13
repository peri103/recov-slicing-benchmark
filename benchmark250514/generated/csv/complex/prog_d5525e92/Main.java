import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data
        String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

        // Create CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Unrelated code to make the program more complex
        Map<String, Integer> wordCount = new HashMap<>();
        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // More unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of squares: " + sum);

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // More unrelated code
            Map<String, String> capitalCities = new HashMap<>();
            capitalCities.put("France", "Paris");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Italy", "Rome");

            // Read the comment from the first record
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

            // More unrelated code
            for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
                System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue());
            }

            // Print the word count
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}