import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nDoe,25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Read from the first record using the read method
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            
            // Print the result
            System.out.println(isConsistent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}