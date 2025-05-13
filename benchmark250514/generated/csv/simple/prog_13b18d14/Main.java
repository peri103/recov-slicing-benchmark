import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with ignoring header case
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Create a sample CSVRecord list for demonstration
            List<CSVRecord> records = format.parse(new java.io.StringReader("Header1,Header2\nvalue1,value2")).getRecords();
            
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                // Check if a field is mapped
                /* read */ boolean isMapped = record.isMapped("HEADER1");
                System.out.println("Is 'HEADER1' mapped: " + isMapped);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}