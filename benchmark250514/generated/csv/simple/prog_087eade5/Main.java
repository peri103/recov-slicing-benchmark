import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces(true);

            // Prepare a sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Use the read method on the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("Name");

            // Print the result
            System.out.println("Is 'Name' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}