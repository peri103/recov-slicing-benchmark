import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withQuote('"');

            // Create a sample CSV data
            String csvData = "\"Name\",\"Age\"\n\"Alice\",\"30\"\n\"Bob\",\"25\"";

            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Read a CSVRecord and convert it to a String
            /* read */ String recordString = records.get(0).toString();

            // Output the CSVRecord as a String
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}