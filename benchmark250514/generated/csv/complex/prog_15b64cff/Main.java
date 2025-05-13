import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter for CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record using CSVPrinter
            /* write */ csvPrinter.printRecord("John", "Doe", 30);
            
            // Add complexity: create another CSVPrinter and write additional records
            StringWriter writer2 = new StringWriter();
            CSVPrinter csvPrinter2 = new CSVPrinter(writer2, CSVFormat.DEFAULT);
            csvPrinter2.printRecord("Alice", "Smith", 25);
            csvPrinter2.printRecord("Bob", "Johnson", 40);
            csvPrinter2.close();
            
            // Close the original CSVPrinter
            csvPrinter.close();
            
            // Read the CSV content from both StringWriters
            String csvData = writer.toString();
            String csvData2 = writer2.toString();
            
            // Parse the CSV content
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new StringReader(csvData)).getRecords();
            List<CSVRecord> records2 = CSVFormat.DEFAULT.parse(new StringReader(csvData2)).getRecords();
            
            // Add complexity: process the second set of records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records2) {
                names.add(record.get(0) + " " + record.get(1));
            }
            
            // Perform additional operations with the names list
            for (String name : names) {
                System.out.println("Processed name: " + name);
            }
            
            // Read the value using CSVRecord from the original record
            /* read */ String firstName = records.get(0).get(0);
            
            // Print the read value
            System.out.println("Original first name: " + firstName);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}