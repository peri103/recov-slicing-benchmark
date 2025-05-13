import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Use StringWriter to capture CSV output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);
            printer.printRecord(Arrays.asList("Column1", "Column2"));
            printer.printRecord(Arrays.asList("Value1", "Value2"));
            printer.flush();

            // Read the records
            String csvData = out.toString();
            Iterable<CSVRecord> records = format.parse(new java.io.StringReader(csvData));

            // Check if a specific column is set
            for (CSVRecord record : records) {
                /* read */ boolean isSet = record.isSet("Column1");
                System.out.println("Column1 is set: " + isSet);
                break;  // Ensure the read method is executed only once
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}