import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a CSVFormat object with ignoreEmptyLines set to true
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\n\nJane Doe, 25";

            // Parsing the CSV data using the CSVFormat object
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Reading the first record to check if a specific column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' column set in first record: " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}