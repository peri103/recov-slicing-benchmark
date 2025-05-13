import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Prepare a CSV format with a custom record separator
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withRecordSeparator(";");

        // Prepare data to be written
        List<String> data = Arrays.asList("John", "Doe", "john.doe@example.com");

        // Use StringWriter to capture CSV output
        StringWriter out = new StringWriter();
        try {
            CSVPrinter printer = new CSVPrinter(out, format);
            printer.printRecord(data);
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the CSV output back as a string
        String csvOutput = out.toString();
        CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).getRecords().get(0);

        /* read */ String value = record.toString();
        System.out.println(value);
    }
}