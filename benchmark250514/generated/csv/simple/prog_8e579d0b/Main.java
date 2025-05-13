import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        // Sample CSV data
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read using the read method
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Is the record consistent? " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}