import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            for (CSVRecord record : parser) {
                // Check if a specific column is set
                /* read */ boolean isSet = record.isSet("age");
                System.out.println("Is 'age' column set? " + isSet);
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}