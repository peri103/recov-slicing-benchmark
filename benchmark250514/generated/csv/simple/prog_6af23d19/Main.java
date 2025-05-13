import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with the first record as header
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record
            CSVRecord firstRecord = records.get(0);

            // Check if the 'name' field is mapped
            /* read */
            boolean isMapped = firstRecord.isMapped("name");

            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}