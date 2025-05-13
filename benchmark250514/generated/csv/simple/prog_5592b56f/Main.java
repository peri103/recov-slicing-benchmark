import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');

            // Example CSV data
            String csvData = "\"Name\",\"Age\"\n\"Alice\",\"30\"\n\"Bob\",\"25\"";

            // Parse the CSV data using the format with quotes
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the toString method to read the record
            /* read */ String recordString = record.toString();

            // Output the result
            System.out.println(recordString);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}