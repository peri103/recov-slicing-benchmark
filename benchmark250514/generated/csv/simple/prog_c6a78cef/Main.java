import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data as a string
        String csvData = "Name, Age, City\nJohn, 30, New York\nJane, 25, Los Angeles";

        // Initialize CSVFormat with trimming enabled
        CSVFormat format = CSVFormat.DEFAULT.withTrim(); // /* write */

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and check if a column is mapped
            CSVRecord record = records.get(0);
            boolean isMapped = record.isMapped("Name"); // /* read */
            System.out.println(isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}