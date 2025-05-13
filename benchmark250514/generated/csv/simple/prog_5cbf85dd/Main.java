import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming enabled
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Example CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Check if a specific column is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' column mapped? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}