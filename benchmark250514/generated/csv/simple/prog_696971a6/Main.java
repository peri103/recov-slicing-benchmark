import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data using the format with the specified delimiter
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Assume we want to read the first record as a string
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}