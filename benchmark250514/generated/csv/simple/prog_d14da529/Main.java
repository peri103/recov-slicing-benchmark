import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(";");
            
            // Use StringWriter to capture the output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write data using the format
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("value1", "value2", "value3");
            printer.flush();
            
            // Convert the written data to CSVRecord for reading
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);
            
            // Read the CSVRecord as a string
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}