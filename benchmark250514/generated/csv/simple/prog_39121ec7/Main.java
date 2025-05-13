import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Get the first record
            CSVRecord record = records.get(0);

            // Check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' column mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}