import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();

            // Prepare a sample CSV input
            String csvData = "Name, Age\n John Doe , 29\n Jane Doe , 31";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the record consistent? " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}