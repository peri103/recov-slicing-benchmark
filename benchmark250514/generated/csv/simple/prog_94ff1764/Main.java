import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV format with ignore header case
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name, Age\nJohn, 30\nJane, 25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println(isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}