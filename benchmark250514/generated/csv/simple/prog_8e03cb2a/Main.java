import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with headers
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,Canada";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}