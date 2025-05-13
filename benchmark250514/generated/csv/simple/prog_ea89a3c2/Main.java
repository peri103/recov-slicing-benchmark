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
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a value to the CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();
            
            // Initialize a StringReader to read the CSV content
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV content
            CSVParser csvParser = CSVFormat.DEFAULT.parse(reader);
            
            // Read the value from the CSV
            CSVRecord record = csvParser.getRecords().get(0);
            /* read */ String value = record.get(0);
            
            // Print the read value
            System.out.println(value);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}