import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withNullString("NULL");

            // Prepare a CSV content to parse
            String csvContent = "name,age\nJohn,NULL\nDoe,25";
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), csvFormat);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column in the record is set
            /* read */ boolean isSet = record.isSet("age");
            System.out.println("Is 'age' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}