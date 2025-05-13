import java.io.StringWriter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance using the StringWriter
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Use the write method to print a value to the CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();  // Ensure the data is flushed to the writer
            
            // Parse the written CSV content using CSVParser
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            
            // Read the first record and the first value using the read method
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);
            
            // Print the read value
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}