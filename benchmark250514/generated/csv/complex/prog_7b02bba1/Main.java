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
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a single value to the CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Additional unrelated code to increase complexity
            Map<String, Integer> frequencyMap = new HashMap<>();
            frequencyMap.put("Hello", 1);
            frequencyMap.put("World", 2);

            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Parse the CSV output
            String csvContent = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            // Additional unrelated code to increase complexity
            int sum = 0;
            for (Integer value : frequencyMap.values()) {
                sum += value;
            }
            System.out.println("Sum of frequencies: " + sum);

            // Read the value back from the CSV
            /* read */ String value = record.get(0);
            System.out.println(value);

            // More unrelated code to increase complexity
            for (int i = 0; i < 3; i++) {
                System.out.println("Loop iteration: " + i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}