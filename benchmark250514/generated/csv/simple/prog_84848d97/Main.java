import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write data using the CSVPrinter
            /* write */ csvPrinter.print("Hello, World");
            csvPrinter.flush();
            
            // Parse the written CSV data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            
            // Read the first record from the CSVParser
            CSVRecord record = parser.getRecords().get(0);
            
            // Read the value from the record
            /* read */ String value = record.get(0);
            
            // Print the read value
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}