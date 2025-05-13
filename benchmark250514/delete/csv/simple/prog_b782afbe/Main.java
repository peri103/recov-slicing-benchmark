import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the StringWriter to capture the output of CSVPrinter
            StringWriter writer = new StringWriter();

            // Create a CSVFormat instance and configure it with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');

            // Create a CSVPrinter using the configured CSVFormat
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write a record to the CSVPrinter
            printer.printRecord(Arrays.asList("value1", "value2", "value3"));

            // Flush the printer to ensure all data is written to the StringWriter
            printer.flush();

            // Capture the output as a CSVRecord
            String csvOutput = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(csvOutput).getRecords().get(0);

            // Use the read method to read the value written by the write method
            /* read */ String recordString = record.toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}