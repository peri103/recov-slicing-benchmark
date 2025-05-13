import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a delimiter and other configurations
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');
            format = format.withQuoteMode(QuoteMode.NON_NUMERIC);

            // Prepare CSV data to parse
            String csvData = "name;age;location\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional operations on CSVRecords
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get(0)); // Extracting names
            }

            // Perform operations on the extracted names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();

            // Output the result
            System.out.println("First record: " + recordString);

            // Additional unrelated computation
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of integers from 0 to 9: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}