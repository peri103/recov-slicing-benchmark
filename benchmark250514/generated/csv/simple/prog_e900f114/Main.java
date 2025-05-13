import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare the CSV data
            String csvData = "name, age\nJohn Doe, 30";

            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific column is set
            /* read */ boolean isNameSet = record.isSet("name");
            
            // Print the result
            System.out.println("Is 'name' set? " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}