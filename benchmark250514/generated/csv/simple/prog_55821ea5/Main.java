import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            Iterable<CSVRecord> records = format.parse(reader);

            // Read the first record
            CSVRecord record = records.iterator().next();

            // Use read method
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}