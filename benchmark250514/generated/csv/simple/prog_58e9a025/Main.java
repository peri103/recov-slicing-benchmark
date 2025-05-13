import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSV format with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name, Age\nJohn Doe, 29\nJane Doe, 27";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println(isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}