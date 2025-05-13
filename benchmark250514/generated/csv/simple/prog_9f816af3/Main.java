import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the write method
            /* write */
            CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Create a sample CSV data
            String csvData = "Name, Age, Location\nJohn, 30, USA\n\nEmily, 25, UK";

            // Parse the CSV data using CSVParser
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Read the records and use the read method
            for (CSVRecord record : parser) {
                /* read */
                boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}