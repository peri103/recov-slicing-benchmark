import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to hold the CSV data
            StringWriter writer = new StringWriter();
            
            // Initialize the CSVPrinter
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write data to the CSVPrinter
            /* write */ printer.print("Hello, World!");
            printer.flush(); // Ensure data is written to the StringWriter
            
            // Prepare some complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * i);
            }
            
            HashMap<String, Integer> map = new HashMap<>();
            for (int num : numbers) {
                map.put("Number " + num, num);
            }
            
            // Perform some calculations
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of squares: " + sum);
            
            // Prepare a StringReader to read the CSV data
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
            
            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Get the value from the record
            /* read */ String value = record.get(0);
            System.out.println(value);
            
            // Close resources
            parser.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}