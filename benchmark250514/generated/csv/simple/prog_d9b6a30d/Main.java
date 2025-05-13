import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "name,age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if a field is set
            /* read */ boolean isNameSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record: " + isNameSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}