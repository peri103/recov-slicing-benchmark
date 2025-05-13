import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT /* write */.withRecordSeparator(";");
            
            // Prepare data to write
            List<String> data = Arrays.asList("value1", "value2", "value3");
            
            // Use StringWriter to capture the output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write data to CSV
            printer.printRecord(data);
            printer.flush();
            
            // Convert the written CSV to a CSVRecord
            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
            
            // Read the CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}