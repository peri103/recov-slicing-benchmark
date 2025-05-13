import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize necessary variables
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;

        try {
            // Create a CSVPrinter with the specified format
            /* write */ CSVPrinter printer = new CSVPrinter(writer, format.withEscape('\\'));
            // Write a record to the CSV
            printer.printRecord(Arrays.asList("value1", "value2", "value3"));
            printer.flush();

            // Read the written record
            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
            /* read */ String recordString = record.toString();

            // Output the record
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}