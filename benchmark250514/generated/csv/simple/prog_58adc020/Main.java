import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and use the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Prepare a sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method
            /* read */ boolean isSet = record.isSet("name");

            // Print the result
            System.out.println("Is 'name' set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}