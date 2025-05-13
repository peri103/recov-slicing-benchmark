import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming enabled
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format.withHeader());

            // Read the first record and check if it's mapped
            CSVRecord record = parser.iterator().next();
            /* read */ boolean isMapped = record.isMapped();

            // Output the result
            System.out.println("Is the record mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}