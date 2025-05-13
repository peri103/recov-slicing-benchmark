import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format object with a quote character
            CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
            /* write */ CSVFormat quotedFormat = format.withQuote('"');

            // Prepare a CSV string using the quoted format
            String csvData = quotedFormat.format("value1", "value2", "value3");

            // Parse the CSV data using the quoted format
            List<CSVRecord> records = quotedFormat.parse(new StringReader(csvData)).getRecords();

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}