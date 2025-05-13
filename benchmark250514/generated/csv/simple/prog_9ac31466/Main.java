import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

        // Example CSV data
        String csvData = "name, age, city\nJohn, 30, New York\nJane, 25, Los Angeles";

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Use the read method on the first record
            /* read */ boolean isMapped = records.get(0).isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}