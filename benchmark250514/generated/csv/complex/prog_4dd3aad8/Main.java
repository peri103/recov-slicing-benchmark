import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific configuration
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Additional CSVFormat configuration
            CSVFormat formatWithQuotes = format.withQuoteMode(QuoteMode.ALL);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";
            String csvDataWithQuotes = "\"Name\", \"Age\"\n\"John Doe\", \"30\"\n\"Jane Smith\", \"25\"";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVParser parserWithQuotes = CSVParser.parse(new StringReader(csvDataWithQuotes), formatWithQuotes);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();
            List<CSVRecord> recordsWithQuotes = parserWithQuotes.getRecords();

            // Additional operations using CSVRecord
            for (CSVRecord record : recordsWithQuotes) {
                System.out.println("Record with quotes: " + record);
            }

            // Unrelated complexity: Working with a list of integers
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            // Process the list of numbers
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

            // Retrieve the first record and check if the column is mapped
            CSVRecord firstRecord = records.get(0);

            // Perform some unrelated operations
            int maxNumber = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
            System.out.println("Max number: " + maxNumber);

            // Check if the record is mapped
            /* read */ boolean isMapped = firstRecord.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped in the record? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}