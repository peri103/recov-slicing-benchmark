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

            // Create a sample CSV string
            String csvData = "name;age;location\nJohn Doe;30;USA";

            // Parse the CSV string using the format with the custom delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String recordString = record.toString();

            // Output the record string
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}