import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator('\n');

            // Prepare a CSV input string
            String csvData = "name,age\nJohn,30\nJane,25";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String recordString = record.toString();
            
            // Output the record
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}