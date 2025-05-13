import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Sample data using the specified format
            String csvData = "name;age;location\nJohn Doe;30;USA";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Read the first record and convert it to a string
            for (CSVRecord record : records) {
                /* read */ String recordString = record.toString();
                System.out.println(recordString);
                break; // Ensure read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}