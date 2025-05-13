import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25\n";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Get the first record and check if a column is set
            CSVRecord record = records.get(0);

            // Check if the 'age' column is set in the first record
            /* read */ boolean isAgeSet = record.isSet("age");

            System.out.println("Is 'age' column set in the first record? " + isAgeSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}