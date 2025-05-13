import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with a specific delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Example CSV data
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data using the format with the specified delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the record as a string
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}