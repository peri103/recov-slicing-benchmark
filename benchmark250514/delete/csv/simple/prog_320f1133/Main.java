import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(";");

            // Use StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSVPrinter
            printer.printRecord("Name", "Age", "Country");

            // Flush the printer to ensure all data is written
            printer.flush();

            // Read the output as a CSVRecord
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(csvData).getRecords().get(0);

            // Read the CSVRecord using the toString method
            /* read */ String recordString = record.toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}