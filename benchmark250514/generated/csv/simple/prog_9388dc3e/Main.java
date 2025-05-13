import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a particular column is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            
            System.out.println("Is 'Name' column mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}