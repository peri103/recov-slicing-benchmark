import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = null;
        Map<String, Integer> wordCount = new HashMap<>();

        // Initialize word count map
        wordCount.put("Hello", 0);
        wordCount.put("world", 0);

        try {
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.print("Hello, world!");
            csvPrinter.flush(); // Ensure data is written to the writer

            // Perform some unrelated operations
            for (String word : wordCount.keySet()) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            
            // Print word counts
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Parse CSV data
            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            // More unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);

            /* read */ String value = record.get(0);
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvPrinter != null) {
                    csvPrinter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}