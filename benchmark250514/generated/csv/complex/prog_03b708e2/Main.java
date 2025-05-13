import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSV
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            
            // Additional unrelated code to increase complexity
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }
            
            // Flush the printer to ensure all data is written to the StringWriter
            csvPrinter.flush();
            
            // Use the content of the StringWriter for reading
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV content
            CSVParser csvParser = CSVFormat.DEFAULT.parse(reader);
            
            // More unrelated code to increase complexity
            int sum = 0;
            int[] numbers = {1, 2, 3, 4, 5};
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
            
            // Get the first record
            List<CSVRecord> records = csvParser.getRecords();
            CSVRecord record = records.get(0);
            
            // Read a value from the record
            /* read */ String firstName = record.get(0);
            
            // Print the read value
            System.out.println(firstName);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}