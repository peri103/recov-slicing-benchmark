import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write records
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record
            /* write */ csvPrinter.printRecord("Alice", "24", "Engineer");
            
            // Close the printer to flush the data to the writer
            csvPrinter.flush();

            // Retrieve the written CSV data
            String csvData = writer.toString();

            // Initialize a CSVParser to read records
            CSVParser parser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            
            // Read the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);
            
            // Read a value from the record
            /* read */ String name = record.get(0);
            
            // Print the value
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}