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
            CSVFormat format = CSVFormat.DEFAULT /* write */.withRecordSeparator(';');

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter to write data using the specified format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSVPrinter
            printer.printRecord(Arrays.asList("John", "Doe", "30"));
            printer.flush();

            // Read the CSV output
            String csvOutput = writer.toString();

            // Convert the CSV output to a CSVRecord
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).getRecords().get(0);

            // Read the record using toString method
            /* read */ String recordString = record.toString();

            // Print the read value
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}