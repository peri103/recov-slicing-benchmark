import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter using the default format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSVPrinter
            /* write */ printer.printRecord("value1", "value2", "value3");
            
            // Flush the printer to ensure the record is written to the StringWriter
            printer.flush();
            
            // Parse the written CSV data into CSVRecords
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            
            // Read the first value from the first record
            /* read */ String value = records.get(0).get(0);
            
            // Output the read value
            System.out.println(value);
            
            // Close the printer
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}