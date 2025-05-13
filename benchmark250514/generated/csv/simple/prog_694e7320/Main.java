import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
            
            // Sample CSV data
            String csvData = "name,age\nJohn Doe,30\nJane Doe,25";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the first record and check if a column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");
            
            // Output the result
            System.out.println("Is 'name' column set: " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}