import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV content
            String csvContent = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

            // Parse the CSV content with the header
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withFirstRecordAsHeader();
            
            CSVParser parser = new CSVParser(new StringReader(csvContent), format);
            CSVRecord record = parser.getRecords().get(0); // Get the first record

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' column mapped? " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}