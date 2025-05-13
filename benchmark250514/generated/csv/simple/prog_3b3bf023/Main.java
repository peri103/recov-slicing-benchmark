import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "name, age, city\nJohn Doe, 30, New York";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and check if a field is mapped
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("name");

            // Output the result
            System.out.println("Is 'name' mapped: " + isMapped);

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}