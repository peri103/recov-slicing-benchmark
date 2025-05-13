import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the writer and CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();

            // Read the record
            String csvContent = writer.toString();
            CSVParser csvParser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            List<CSVRecord> records = csvParser.getRecords();
            CSVRecord record = records.get(0);

            // Get the value from the record
            /* read */ String value = record.get(0);
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}