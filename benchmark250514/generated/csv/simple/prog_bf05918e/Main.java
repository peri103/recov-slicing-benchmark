import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with the write method
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

        // Create a sample CSV string
        String csvData = "name, age\nJohn Doe, 30";

        // Parse the CSV string using the format
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

        // Read from the first record using the read method
        /* read */ boolean isSet = records.get(0).isSet("name");

        // Output the result
        System.out.println("Is 'name' set in the first record? " + isSet);
    }
}