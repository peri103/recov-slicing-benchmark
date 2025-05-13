import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowMissingColumnNames set to true
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and check its consistency
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}