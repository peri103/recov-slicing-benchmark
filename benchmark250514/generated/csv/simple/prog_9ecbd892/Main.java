import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
            
            // Create a CSV string to parse
            String csvData = "\"Name\",\"Age\",\"City\"\n\"John Doe\",\"30\",\"New York\"";
            
            // Parse the CSV string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Use the toString method of CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}