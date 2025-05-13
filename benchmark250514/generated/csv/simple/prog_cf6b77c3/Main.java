import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Prepare CSV data to parse
            String csvData = "Name,Age\nJohn\\, Doe,30\nJane\\, Smith,25";

            // Parse CSV data using the format with escape character
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();

            // Print the result
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}