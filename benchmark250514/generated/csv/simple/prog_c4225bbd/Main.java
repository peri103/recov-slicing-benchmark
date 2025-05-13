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
            // Prepare a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Create CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write data using CSVPrinter
            /* write */ printer.print("Hello, World!");
            printer.flush();
            
            // Prepare a StringReader to read the CSV data
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT);
            
            // Read the data using CSVRecord
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);
            
            // Output the value
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}