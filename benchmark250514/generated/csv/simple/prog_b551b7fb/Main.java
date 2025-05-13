import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withRecordSeparator(";");

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter to write data using the format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSV
            printer.printRecord("John", "Doe", "john.doe@example.com");

            // Close the printer to flush data to the writer
            printer.close();

            // Read the written CSV data
            String csvData = writer.toString();

            // Parse the CSV data to get a CSVRecord
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Use the read method to get the string representation of the CSVRecord
            /* read */ String recordString = record.toString();

            // Output the record string
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}