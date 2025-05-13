import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access a CSVRecord
            CSVRecord record = records.get(0);

            // Check if a column is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' column set? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}