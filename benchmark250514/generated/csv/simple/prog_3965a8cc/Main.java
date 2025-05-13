import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withQuote('"');

        // Create a CSVRecord to read
        String csvData = "\"value1\",\"value2\"";
        CSVRecord record = null;
        try {
            record = csvFormat.parse(new StringReader(csvData)).getRecords().get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the CSVRecord
        /* read */ String recordString = record.toString();
        System.out.println(recordString);
    }
}