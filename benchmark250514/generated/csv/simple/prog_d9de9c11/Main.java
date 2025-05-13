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
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance with default CSVFormat
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSVPrinter
            /* write */ printer.printRecord("value1", "value2", "value3");
            
            // Flush the CSVPrinter to ensure all data is written to the StringWriter
            printer.flush();
            
            // Prepare a StringReader to read the CSV data
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV data using CSVParser
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
            
            // Read the first CSVRecord from the parser
            CSVRecord record = parser.getRecords().get(0);
            
            // Retrieve a value from the CSVRecord
            /* read */ String value = record.get(0);
            
            // Print the retrieved value
            System.out.println(value);
            
            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}