import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

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
            
            // Create a list to store CSV records
            List<CSVRecord> recordList = new ArrayList<>();
            recordList.addAll(parser.getRecords());
            
            // Create a map to store email addresses with names as keys
            HashMap<String, String> emailMap = new HashMap<>();
            for (CSVRecord rec : recordList) {
                String name = rec.get(0) + " " + rec.get(1);
                emailMap.put(name, rec.get(2));
            }
            
            // Access a specific field from the record
            CSVRecord record = recordList.get(0);
            /* read */ String email = record.get(2);
            
            // Print the value read from the record
            System.out.println("Email: " + email);
            
            // Print all names and emails from the map
            for (String name : emailMap.keySet()) {
                System.out.println("Name: " + name + ", Email: " + emailMap.get(name));
            }
            
            // Perform additional operations on the records
            for (CSVRecord rec : recordList) {
                System.out.println("Full Record: " + rec.toString());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}