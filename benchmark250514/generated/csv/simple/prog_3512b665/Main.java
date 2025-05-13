import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it with the escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Prepare a StringWriter to capture CSV output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);

            // Write some data using the configured format
            printer.printRecord("Name", "Age", "Location");
            printer.printRecord("John Doe", "30", "New York");
            printer.flush();

            // Read the output back using CSVParser
            String csvData = out.toString();
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();

            // Use the read method to get a string representation of a CSVRecord
            /* read */ String recordString = records.get(1).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}