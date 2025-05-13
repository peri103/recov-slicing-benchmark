import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');

            // Prepare data to write
            List<String> data = Arrays.asList("John", "Doe", "john.doe@example.com");

            // Use StringWriter to capture the CSV output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);
            printer.printRecord(data);
            printer.flush();

            // Read the CSV output as a CSVRecord
            String csvContent = out.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);

            // Read the CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}