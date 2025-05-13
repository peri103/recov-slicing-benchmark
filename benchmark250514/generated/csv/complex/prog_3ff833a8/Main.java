import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withQuote('"');

        // Create a mock CSV data
        String csvData = "\"value1\",\"value2\",\"value3\"\n\"value4\",\"value5\",\"value6\"";

        // Parse the CSV data
        List<CSVRecord> records = null;
        try {
            records = CSVParser.parse(csvData, csvFormat).getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Perform operations on CSVRecords
        if (records != null && !records.isEmpty()) {
            CSVRecord firstRecord = records.get(0);
            CSVRecord secondRecord = records.get(1);

            // Process and print details of the first record
            System.out.println("First Record:");
            for (String value : firstRecord) {
                System.out.println("Value: " + value);
            }

            // Process and print details of the second record
            System.out.println("Second Record:");
            for (String value : secondRecord) {
                System.out.println("Value: " + value);
            }

            // Perform operations on a separate list
            List<String> additionalValues = Arrays.asList("extra1", "extra2", "extra3");
            for (String value : additionalValues) {
                System.out.println("Additional Value: " + value);
            }

            // Read and print the CSVRecord
            /* read */ String recordString = firstRecord.toString();
            System.out.println("First Record String: " + recordString);
        }
    }
}