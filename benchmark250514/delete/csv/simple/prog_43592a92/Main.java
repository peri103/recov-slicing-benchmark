import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVFormat object and set the record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator("\n");

            // Create a CSVPrinter to write data to the StringWriter using the specified format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSVPrinter
            printer.printRecord("Name", "Age", "Location");
            printer.printRecord("Alice", 30, "Wonderland");
            printer.flush();

            // Read the CSV data from the StringWriter
            String csvData = writer.toString();

            // Split the CSV data into individual records
            String[] records = csvData.split("\n");

            // Create a CSVRecord object from the first record (header)
            CSVRecord record = CSVFormat.DEFAULT.parse(new StringReader(records[1])).getRecords().get(0);

            // Read the CSVRecord using the toString method
            /* read */ String recordString = record.toString();

            // Print the output
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}