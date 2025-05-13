import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Prepare CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";

        try {
            // Create a map to simulate additional data processing
            Map<String, Integer> nameToAgeMap = new HashMap<>();

            // Create CSVFormat with the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Process each record and fill the map
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameToAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (int age : nameToAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);

            // Create another CSV format for different processing
            CSVFormat formatWithQuotes = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);

            // Simulate another parsing scenario
            CSVParser parserWithQuotes = new CSVParser(new StringReader(csvData), formatWithQuotes);
            for (CSVRecord record : parserWithQuotes) {
                System.out.println("Quoted record: " + record);
            }

            // Get the first record from the original parser
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Check if the record is mapped (has headers)
            /* read */ boolean isMapped = firstRecord.isMapped();

            // Output the result
            System.out.println("Is the first record mapped? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}