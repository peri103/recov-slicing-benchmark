import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeader("Name", "Age", "Country");

            // Create a sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nAlice,25,UK";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Read using isSet method
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("Name");
            System.out.println("Is 'Name' set: " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}