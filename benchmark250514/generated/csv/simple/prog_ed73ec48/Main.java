import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVFormat instance and set a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(" | ");

            // Create a CSVPrinter to write data using the specified format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a sample record
            printer.printRecord("Alice", "Bob", "Charlie");

            // Flush the printer to ensure all data is written
            printer.flush();

            // Parse the written data back into a CSVRecord
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Read the record using the toString method
            /* read */ String recordString = record.toString();

            // Output the record string
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}