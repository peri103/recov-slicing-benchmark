import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim option
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, City\nJohn Doe, 29, New York";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' column mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}