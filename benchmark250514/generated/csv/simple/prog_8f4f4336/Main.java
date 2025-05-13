import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');

            // Create a sample CSV input
            String csvInput = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV input
            CSVParser parser = CSVParser.parse(csvInput, format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and print its string representation
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}