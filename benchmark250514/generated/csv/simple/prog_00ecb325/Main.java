import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";
        try {
            // Parse the CSV data using the configured CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            
            for (CSVRecord record : parser) {
                // Read the consistency of each record
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}