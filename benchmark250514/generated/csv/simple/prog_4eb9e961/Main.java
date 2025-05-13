import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        
        try {
            // Initialize CSVFormat with a record separator
            CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
            /* write */ CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write a record using the CSVPrinter
            printer.printRecord("value1", "value2", "value3");
            printer.flush();

            // Read the record using CSVRecord
            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
            /* read */ String recordString = record.toString();
            
            // Output the read value
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}