import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string
            CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
            /* write */ format = format.withNullString("NULL");

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,NULL,USA\nJane,30,UK";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the 'Location' field is set
            /* read */ boolean isLocationSet = record.isSet("Location");

            System.out.println("Is 'Location' set for the first record? " + isLocationSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}