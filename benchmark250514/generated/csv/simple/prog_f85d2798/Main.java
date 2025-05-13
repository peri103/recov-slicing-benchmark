import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Initialize CSVPrinter with the desired format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record using the CSVPrinter
            /* write */ printer.printRecord("John", "Doe", "john.doe@example.com");
            printer.flush();
            
            // Parse the CSV data back into CSVRecords
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            
            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Access a specific field from the record
            /* read */ String email = record.get(2);
            
            // Print the value read from the record
            System.out.println(email);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}