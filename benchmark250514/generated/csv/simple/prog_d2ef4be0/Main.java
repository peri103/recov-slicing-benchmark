import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(';');

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,New York;Jane,25,Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String output = record.toString();

            // Output the record
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}