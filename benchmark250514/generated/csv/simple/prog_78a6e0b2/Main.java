import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "Name,Age\nJohn,30\nDoe,25";

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Access the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the isSet method to check if a column is set
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' column set? " + isSet);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}