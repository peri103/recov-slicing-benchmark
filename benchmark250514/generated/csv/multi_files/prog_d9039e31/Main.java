import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVHandler
            CSVHandler csvHandler = new CSVHandler();

            // Create a sample CSV string
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV data
            csvHandler.parseCSV(csvData);

            // Retrieve records from the CSVHandler
            List<CSVRecord> records = csvHandler.getRecords();

            // Initialize DataProcessor and process records
            DataProcessor dataProcessor = new DataProcessor();
            dataProcessor.processRecords(records);

            // Print the name-age map
            dataProcessor.printNameAgeMap();

            // Calculate and print the average age
            double averageAge = dataProcessor.calculateAverageAge();
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the retrieved comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}