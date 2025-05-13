import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a CSV format with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Sample CSV content
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // Read the first record
            /* read */ String recordString = record.toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}