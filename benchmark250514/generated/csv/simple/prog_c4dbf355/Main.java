import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data as a string
        String csvData = "Name, Age, Location\nJohn Doe, 28, USA";

        try {
            // Create a CSVFormat object and configure it to ignore header case
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Get the first record (assuming there is at least one record)
            CSVRecord record = records.get(0);

            // Write operation: configure the format to ignore header case
            /* write */ format = format.withIgnoreHeaderCase();

            // Read operation: check if the record is mapped
            /* read */ boolean isMapped = record.isMapped("name");

            // Output the result
            System.out.println("Is 'name' mapped: " + isMapped);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}