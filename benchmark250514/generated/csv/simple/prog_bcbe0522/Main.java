import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}