import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Sample CSV content
            String csvContent = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV content using the format
            CSVParser parser = new CSVParser(new StringReader(csvContent), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and check consistency
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();

            System.out.println("Is the first record consistent? " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}