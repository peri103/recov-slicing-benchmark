import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Create a sample CSV data
            String csvData = "name;age;city\nJohn Doe;30;New York";

            // Parse the CSV data using the format with the specified delimiter
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();

            // Output the record string
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}