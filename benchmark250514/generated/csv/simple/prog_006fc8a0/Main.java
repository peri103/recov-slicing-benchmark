import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();

            // Initialize CSVFormat with escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');

            // Use CSVPrinter to write data with the specified format
            try (CSVPrinter printer = new CSVPrinter(writer, format)) {
                printer.printRecord(Arrays.asList("value1", "value2"));
            }

            // Convert the written CSV data to CSVRecord for reading
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Read and print the CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}