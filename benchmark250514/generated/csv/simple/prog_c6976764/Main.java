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
            /* write */ format = format.withRecordSeparator('|');

            // Prepare a StringWriter and CSVPrinter to write data
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);

            // Write a record
            printer.printRecord("John", "Doe", "30");
            printer.flush();

            // Use the written data to create a CSVRecord
            String csvData = out.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Read and print the CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}