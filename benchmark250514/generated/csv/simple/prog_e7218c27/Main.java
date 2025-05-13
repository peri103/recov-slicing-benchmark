import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write data
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write data using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();
            
            // Parse the written CSV data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            
            // Read the data using CSVRecord
            /* read */ String value = record.get(0);
            System.out.println(value);
            
            // Close resources
            csvPrinter.close();
            parser.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}