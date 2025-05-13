import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

            // Parse CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Read and check if a specific column is set in the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("age");

            System.out.println("Is 'age' column set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}