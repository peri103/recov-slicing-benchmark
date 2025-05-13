import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */ .withAllowMissingColumnNames(true);
            
            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25\n";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            
            // Output the result
            System.out.println("Is the first record consistent? " + isConsistent);
            
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}