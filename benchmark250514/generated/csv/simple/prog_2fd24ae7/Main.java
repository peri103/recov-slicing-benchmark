import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true); /* write */

            // Example CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read using the read method
            boolean isConsistent = records.get(0).isConsistent(); /* read */

            System.out.println("Is the first record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}