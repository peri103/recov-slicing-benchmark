import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a quote character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withQuote('"');

        // Prepare data to write
        List<String> data = Arrays.asList("value1", "value2", "value3");

        // Use StringWriter to capture CSV output
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord(data);
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Parse the written CSV string back to CSVRecord
        String csvContent = writer.toString();
        CSVRecord record = null;
        try {
            record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the CSVRecord
        if (record != null) {
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        }
    }
}