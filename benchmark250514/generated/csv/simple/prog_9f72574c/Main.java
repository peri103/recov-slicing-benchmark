import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific quote character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');
            
            // Prepare a sample CSV data
            String csvData = "\"value1\",\"value2\",\"value3\"";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.toString();
            
            // Print the record
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}