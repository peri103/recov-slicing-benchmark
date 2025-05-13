import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSV format with a header
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,Canada";

            // Parse the CSV data using the format with header
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();
            
            // Access the first record and check if a header is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isNameSet = firstRecord.isSet("Name");

            System.out.println("Is 'Name' header set in the first record? " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}