import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a StringWriter to hold the CSV data
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter with default CSV format
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record using the printRecord method
            /* write */ csvPrinter.printRecord("1", "John Doe", "john.doe@example.com");
            
            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();
            
            // Parse the CSV data from the StringWriter
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            
            // Read the first record using the get method
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String name = record.get(1);
            
            // Output the name to the console
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}