import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with trimming enabled
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

        // Sample CSV data
        String csvData = "name,email\nJohn Doe,john.doe@example.com\nJane Doe,jane.doe@example.com";

        try {
            // Parse the CSV data
            Reader reader = new StringReader(csvData);
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and check if a field is mapped
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}