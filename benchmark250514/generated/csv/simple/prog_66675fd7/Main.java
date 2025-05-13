import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if the record is consistent
            /* read */ boolean isConsistent = record.isConsistent();

            // Output the result
            System.out.println("Is the record consistent? " + isConsistent);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}