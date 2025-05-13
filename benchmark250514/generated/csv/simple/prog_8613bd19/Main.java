import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Create a sample CSV content
            String csvContent = "Header1,Header2\nValue1,Value2\nValue3,Value4";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), format);

            // Read the first record using the read method
            CSVRecord record = parser.getRecords().get(0);
            /* read */ boolean isConsistent = record.isConsistent();

            System.out.println("Is the record consistent? " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}