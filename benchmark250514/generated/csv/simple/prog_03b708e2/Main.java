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
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSV
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            
            // Flush the printer to ensure all data is written to the StringWriter
            csvPrinter.flush();
            
            // Use the content of the StringWriter for reading
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV content
            CSVParser csvParser = CSVFormat.DEFAULT.parse(reader);
            
            // Get the first record
            List<CSVRecord> records = csvParser.getRecords();
            CSVRecord record = records.get(0);
            
            // Read a value from the record
            /* read */ String firstName = record.get(0);
            
            // Print the read value
            System.out.println(firstName);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}