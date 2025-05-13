import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method
            /* read */ boolean isSet = record.isSet("name");
            System.out.println(isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}