import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withQuote('"');

        // Sample CSV data as a string
        String csvData = "\"name\",\"age\"\n\"John Doe\",\"30\"";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();

            // Output the string representation of the CSVRecord
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}