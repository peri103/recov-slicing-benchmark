import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with a null string setting
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Create a CSV parser with the format and some sample data
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific column is set
            /* read */ boolean isSet = record.isSet("age");
            System.out.println("Is 'age' set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}