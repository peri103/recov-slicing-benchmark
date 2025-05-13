import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(';');

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the record using toString method
            /* read */ String recordString = record.toString();

            // Print the record
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}