import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("Header Comment");

            // Create a sample CSV data
            String csvData = "Name, Age\nJohn, 30\nDoe, 25";

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and check if "Name" is set
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}