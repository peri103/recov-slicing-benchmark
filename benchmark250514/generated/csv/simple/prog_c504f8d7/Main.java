import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with write method
        CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

        // Create a CSV string to parse
        String csvData = "name, age\nJohn Doe, 30";

        // Parse the CSV string using the format
        List<CSVRecord> records = null;
        try {
            records = csvFormat.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Ensure the records are parsed
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            // Use the read method
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set: " + isSet);
        }
    }
}