import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Prepare a CSV input string
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data using the format with the delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record from the parsed data
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Read the record as a string
            /* read */ String recordString = record.toString();

            // Print the record string
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}