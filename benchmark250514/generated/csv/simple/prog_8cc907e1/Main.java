import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance with allow missing column names
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data using the CSVFormat instance
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Check if a certain column index is set
                /* read */ boolean isSet = record.isSet(1); // Check if the second column is set
                System.out.println("Is column set: " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}