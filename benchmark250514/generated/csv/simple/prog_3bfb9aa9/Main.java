import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
            
            // Prepare a sample CSV string
            String csvData = "Name,Age\nJohn Doe,30\nJane Doe,25";
            
            // Parse the CSV string using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the first record and convert to string
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}