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

            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Use CSVPrinter to write a record
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("value1", "value2");
            printer.flush();

            // Parse the written CSV data into CSVRecord
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Read the record using the toString method
            /* read */ String value = record.toString();
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}