import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim setting
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Iterate through records and read a value
            for (CSVRecord record : records) {
                // Check if a column is mapped
                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' column mapped? " + isMapped);
                break; // Ensure the read operation is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}