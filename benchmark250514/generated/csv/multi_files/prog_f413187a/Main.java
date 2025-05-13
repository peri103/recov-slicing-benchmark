import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVHandler and enable auto flush
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.enableAutoFlush();

        // Define CSV data and headers
        String csvData = "John,25,New York\nAlice,30,Los Angeles\nBob,22,Chicago";
        String[] headers = {"Name", "Age", "City"};

        try {
            // Parse CSV data
            List<CSVRecord> records = csvHandler.parseCSV(csvData, headers);

            // Process and print CSV records
            CSVRecordProcessor processor = new CSVRecordProcessor(records);
            processor.printRecords();

            // Check consistency of the first record
            boolean isConsistent = processor.checkConsistency(0);
            System.out.println("First CSVRecord is consistent: " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}