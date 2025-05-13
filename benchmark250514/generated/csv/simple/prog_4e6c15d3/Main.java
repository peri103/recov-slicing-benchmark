import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
            
            // Create a sample CSV input
            String csvData = "name,age\nJohn Doe,30\nJane Smith,25";
            
            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Read the first record and print its string representation
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}