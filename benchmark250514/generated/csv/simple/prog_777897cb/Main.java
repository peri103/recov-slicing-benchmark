import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the output of CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");

            // Flush and close the CSVPrinter
            csvPrinter.flush();
            csvPrinter.close();

            // Read the value using CSVRecord
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();
            CSVRecord record = records.get(0);

            // Retrieve the value using the 'get' method
            /* read */ String value = record.get(0);
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}