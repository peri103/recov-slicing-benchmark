import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age, Location\nJohn Doe, 30, New York";

        try {
            // Initialize CSVFormat with the write method
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Parse CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Iterate over records and use the read method
            for (CSVRecord record : parser) {
                /* read */
                boolean isConsistent = record.isConsistent();
                System.out.println("Is record consistent? " + isConsistent);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}