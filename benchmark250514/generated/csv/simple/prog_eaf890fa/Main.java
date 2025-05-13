import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
            /* write */ format = format.withEscape('\\');

            // Prepare a CSV string to parse
            String csvData = "name,age\nJohn Doe,30";

            // Parse the CSV string using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}