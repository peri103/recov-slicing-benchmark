import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare the CSV format with a header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nDoe,25,Canada";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a certain header is set
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println(isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}