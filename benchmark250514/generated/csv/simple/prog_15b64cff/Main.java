import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter for CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record using CSVPrinter
            /* write */ csvPrinter.printRecord("John", "Doe", 30);
            
            // Close the CSVPrinter
            csvPrinter.close();
            
            // Read the CSV content from the StringWriter
            String csvData = writer.toString();
            
            // Parse the CSV content
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new StringReader(csvData)).getRecords();
            
            // Read the value using CSVRecord
            /* read */ String firstName = records.get(0).get(0);
            
            // Print the read value
            System.out.println(firstName);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}