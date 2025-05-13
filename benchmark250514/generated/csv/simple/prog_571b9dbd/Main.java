import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a header
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeader("Name", "Age", "Country");

        // Sample CSV data
        String csvData = "Name,Age,Country\nJohn,30,USA\n";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the "Age" header is set in the record
            /* read */ boolean isSet = record.isSet("Age");
            System.out.println(isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}