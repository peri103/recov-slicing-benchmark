import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a sample CSV string
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Create a CSVFormat instance with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Use the read method to check if a field is mapped
            /* read */ boolean isMapped = record.isMapped("name");

            // Print the result
            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}