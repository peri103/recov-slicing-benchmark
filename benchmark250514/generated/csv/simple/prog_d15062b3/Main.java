import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Initialize CSVPrinter with default format
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data to CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Parse the CSV data
            StringReader reader = new StringReader(writer.toString());
            CSVParser csvParser = CSVFormat.DEFAULT.parse(reader);
            
            // Read data from CSV
            CSVRecord record = csvParser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Output the read value
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}