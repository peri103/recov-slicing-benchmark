import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // Convert the first record to a string
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}