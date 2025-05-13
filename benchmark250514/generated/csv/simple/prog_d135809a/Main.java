import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name, Age\nJohn, 30\nDoe, 25";
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Using the write method
        /* write */ format = format.withFirstRecordAsHeader();
        
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Assuming we want to check if the first record is mapped
            CSVRecord record = records.get(0);
            
            // Using the read method
            /* read */ boolean isMapped = record.isMapped("Name");
            
            System.out.println("Is 'Name' mapped: " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}