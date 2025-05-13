import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Sample CSV data
            String csvData = "Name,Age\nJohn\\, Doe,30";

            // Parse CSV data using the format with escape character
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.toString();

            // Print the record as a string
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}