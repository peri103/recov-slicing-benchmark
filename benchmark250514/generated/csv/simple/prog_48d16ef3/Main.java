import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with a delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Prepare a CSV string to parse
            String csvData = "name;age;location\nJohn Doe;30;New York";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();

            // Output the result
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}