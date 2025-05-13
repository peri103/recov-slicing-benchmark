import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withQuote('"');

            // Sample CSV data
            String csvData = "\"name\",\"age\"\n\"John Doe\",\"30\"";

            // Parse CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Read the first record
            CSVRecord record = records.iterator().next();

            // Print the record using toString method
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}