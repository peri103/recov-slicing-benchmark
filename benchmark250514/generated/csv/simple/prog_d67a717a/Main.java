import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Prepare a CSV string to parse
            String csvData = "  value1 , value2  \n value3 ,  value4 ";

            // Parse the CSV string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the value using the read method
            /* read */ boolean isConsistent = record.isConsistent();

            // Output the result
            System.out.println("Is the record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}