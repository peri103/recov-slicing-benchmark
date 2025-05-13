import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with ignoring empty lines
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Read a value from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");

            System.out.println("Is 'name' set in the first record? " + isSet);

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}