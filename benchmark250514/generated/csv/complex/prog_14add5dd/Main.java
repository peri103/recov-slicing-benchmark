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
        try {
            // Prepare to write to a CSV format in memory
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value to the CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Additional complex operations
            Map<String, Integer> wordCount = new HashMap<>();
            String[] words = {"Hello", "World", "Hello", "CSV"};
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Read the value back from the CSV
            String csvContent = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            CSVRecord record = parser.iterator().next();
            /* read */ String value = record.get(0);

            // Print the read value
            System.out.println(value);

            // Close resources
            csvPrinter.close();
            parser.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}