import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,UK";

            // Create a CSVFormat object with trailing delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Parse the CSV data using the csvFormat
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Access the first record and check if a specific column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' column set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}