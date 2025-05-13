import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Prepare a sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if the header "name" is set
            /* read */ boolean isNameSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' header set: " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}