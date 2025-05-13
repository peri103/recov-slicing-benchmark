import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(';');

            // Create a sample CSV input
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data using the CSVFormat with the specified delimiter
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Access the first record and read its string representation
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}