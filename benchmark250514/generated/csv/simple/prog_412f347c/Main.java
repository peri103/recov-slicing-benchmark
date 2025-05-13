import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT.withEscape('\\'); /* write */

            // Prepare a writer to capture the output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter to write data using the format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write some data
            printer.printRecord(Arrays.asList("one", "two", "three"));

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Read the written CSV record
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords().get(0);
            String result = record.toString(); /* read */

            // Print the result
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}