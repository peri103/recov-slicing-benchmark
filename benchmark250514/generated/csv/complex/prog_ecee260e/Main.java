import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 29, New York\nJane Smith, 34, Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional processing: Collect all names into a list
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("Name"));
            }

            // Perform some unrelated complex operations
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            double averageAge = totalAge / (double) records.size();
            System.out.println("Average Age: " + averageAge);

            // Additional processing: Check if 'Location' is mapped for each record
            for (CSVRecord record : records) {
                boolean isLocationMapped = record.isMapped("Location");
                System.out.println("Is 'Location' mapped for record: " + isLocationMapped);
            }

            // Read the first CSVRecord and check if a column is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("Name");
            System.out.println("Is 'Name' mapped in the first record: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}