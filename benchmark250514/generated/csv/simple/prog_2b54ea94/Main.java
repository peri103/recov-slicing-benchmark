import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

            // Create a CSVFormat instance and configure it
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get an iterator for the parsed records
            Iterator<CSVRecord> iterator = parser.iterator();

            // Read the first record
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Is the record consistent? " + isConsistent);
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}