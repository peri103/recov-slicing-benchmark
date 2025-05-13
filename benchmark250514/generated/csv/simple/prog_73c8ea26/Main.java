import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAutoFlush(true);
            
            // Simulate writing and reading CSV data
            writer.append("header1,header2\nvalue1,value2\n");
            writer.flush();
            
            // Parse the written data into CSVRecord
            Iterable<CSVRecord> records = format.parse(new java.io.StringReader(writer.toString()));
            CSVRecord record = records.iterator().next(); // Get the first record
            
            /* read */ boolean isMapped = record.isMapped("header1");
            System.out.println(isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}