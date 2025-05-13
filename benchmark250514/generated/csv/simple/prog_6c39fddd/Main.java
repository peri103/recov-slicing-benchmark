import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string representation
            CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Prepare a CSV input with a null value
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Check if the 'age' field is set
            /* read */ boolean isSet = record.isSet("age");

            // Print the result
            System.out.println("Is 'age' field set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}