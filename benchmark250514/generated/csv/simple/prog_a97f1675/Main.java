import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escaping character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Create a sample CSV input
            String csvData = "Name,Age,Occupation\nJohn Doe,30,Engineer";

            // Parse the CSV data using the format with escape character
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Read the first record and convert it to a string
            CSVRecord record = records.iterator().next();
            /* read */ String recordString = record.toString();

            // Print the string representation of the record
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}