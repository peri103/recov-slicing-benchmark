import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data as a string
        String csvData = "Name, Age, Location\nJohn Doe, 28, USA\nJane Smith, 34, UK";

        try {
            // Create a CSVFormat object and configure it to ignore header case
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Process each record and print details
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                String location = record.get("Location");
                System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);
            }

            // Write operation: configure the format to ignore header case
            /* write */ format = format.withIgnoreHeaderCase();

            // Additional processing: calculate average age
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            double averageAge = totalAge / (double) records.size();
            System.out.println("Average Age: " + averageAge);

            // Check if a specific column is mapped in the first record
            CSVRecord firstRecord = records.get(0);

            // Additional processing: print mapped status for all columns
            for (String column : firstRecord.toMap().keySet()) {
                boolean isMapped = firstRecord.isMapped(column);
                System.out.println("Is '" + column + "' mapped: " + isMapped);
            }

            // Read operation: check if the record is mapped for 'name'
            /* read */ boolean isNameMapped = firstRecord.isMapped("name");

            // Output the result for the read operation
            System.out.println("Is 'name' mapped in the first record: " + isNameMapped);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}