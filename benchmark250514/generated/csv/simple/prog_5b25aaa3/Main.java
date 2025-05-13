import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a custom delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');

        // Sample CSV data to parse
        String csvData = "name;age;city\nJohn Doe;30;New York";

        // Parse the CSV data using the format with the custom delimiter
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Read the first record and convert it to a string
                /* read */ String recordString = record.toString();
                System.out.println(recordString);
                break; // Ensure the read operation is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}