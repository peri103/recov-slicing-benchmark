import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            CSVFormat csvFormat = CSVFormat.DEFAULT /* write */ .withDelimiter(';');

            // Example CSV input string
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data using the configured CSVFormat
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();

            // Print the record string
            System.out.println(recordString);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}