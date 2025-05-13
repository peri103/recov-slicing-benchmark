import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Sample CSV data
            String csvData = "Name;Age;City\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            /* read */ CSVRecord record = parser.getRecords().get(0);
            System.out.println(record.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}