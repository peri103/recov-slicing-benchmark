import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,UK";

            // Create CSVFormat with the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = format.parse(new StringReader(csvData));
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and check if a header is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped: " + isMapped);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}