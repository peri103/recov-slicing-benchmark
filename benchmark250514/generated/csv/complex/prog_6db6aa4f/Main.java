import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write CSV records
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSVPrinter
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            
            // Flush and close the printer to complete writing
            csvPrinter.flush();
            csvPrinter.close();
            
            // Create an ArrayList and add elements
            ArrayList<String> list = new ArrayList<>();
            list.add("element1");
            list.add("element2");
            list.add("element3");
            
            // Create a HashMap and populate it
            HashMap<String, Integer> map = new HashMap<>();
            map.put("key1", 100);
            map.put("key2", 200);
            map.put("key3", 300);
            
            // Perform operations on the HashMap
            int sum = 0;
            for (String key : map.keySet()) {
                sum += map.get(key);
            }
            System.out.println("Sum of values in map: " + sum);
            
            // Parse the written CSV data
            StringReader reader = new StringReader(writer.toString());
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            
            // Read the first record from the CSVParser
            CSVRecord record = csvParser.getRecords().get(0);
            
            // Read a specific value from the record
            /* read */ String value = record.get(0);
            
            // Print the read value
            System.out.println("CSV Value: " + value);
            
            // Close the parser
            csvParser.close();
            
            // Perform additional operations on the ArrayList
            for (String element : list) {
                System.out.println("List element: " + element);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}