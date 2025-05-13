import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access a record and check if a column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' column set? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}