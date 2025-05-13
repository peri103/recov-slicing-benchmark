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
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write CSV records
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSVPrinter
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            
            // Flush and close the printer to complete writing
            csvPrinter.flush();
            csvPrinter.close();
            
            // Parse the written CSV data
            StringReader reader = new StringReader(writer.toString());
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            
            // Read the first record from the CSVParser
            CSVRecord record = csvParser.getRecords().get(0);
            
            // Read a specific value from the record
            /* read */ String value = record.get(0);
            
            // Print the read value
            System.out.println(value);
            
            // Close the parser
            csvParser.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}