import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV configuration
            CSVConfiguration config = new CSVConfiguration();
            config.setEscapeCharacter('\\');

            // Create a CSV processor
            CSVProcessor processor = new CSVProcessor(config);

            // Sample CSV data
            String csvData = "name,age\nJohn Doe,30\nJane Smith,25";

            // Parse CSV data
            processor.parseCSVData(csvData);

            // Retrieve and print the first record
            String firstRecord = processor.getFirstRecordAsString();
            System.out.println("First Record: " + firstRecord);

            // Additional operations on the records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : processor.getRecords()) {
                names.add(record.get(0));
            }

            // Print names
            System.out.println("Names: " + names);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}