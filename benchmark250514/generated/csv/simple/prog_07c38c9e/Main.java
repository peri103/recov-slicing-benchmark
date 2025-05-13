import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat and configure it to ignore empty lines
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nAlice,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Read the first CSV record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set in the first record: " + isSet);

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}