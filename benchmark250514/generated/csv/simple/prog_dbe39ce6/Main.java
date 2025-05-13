import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Sample CSV data to parse
            String csvData = "name,age\nJohn Doe, 30";

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and check if a column is set using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set: " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}