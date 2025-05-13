import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format instance with ignoring header case
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println(isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}