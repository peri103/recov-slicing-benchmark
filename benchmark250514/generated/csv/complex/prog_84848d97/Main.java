import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Initialize a HashMap to store additional data
            HashMap<String, Integer> dataMap = new HashMap<>();
            dataMap.put("Key1", 100);
            dataMap.put("Key2", 200);
            
            // Write data using the CSVPrinter
            /* write */ csvPrinter.print("Hello, World");
            csvPrinter.flush();
            
            // Perform some operations with the HashMap
            int sum = 0;
            for (String key : dataMap.keySet()) {
                sum += dataMap.get(key);
            }
            System.out.println("Sum of values in HashMap: " + sum);
            
            // Initialize an ArrayList and perform operations
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("First");
            stringList.add("Second");
            stringList.add("Third");
            
            for (String str : stringList) {
                System.out.println("ArrayList item: " + str);
            }
            
            // Parse the written CSV data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            
            // Read the first record from the CSVParser
            CSVRecord record = parser.getRecords().get(0);
            
            // Read the value from the record
            /* read */ String value = record.get(0);
            
            // Print the read value
            System.out.println(value);
            
            // Perform additional operations with ArrayList
            stringList.add("Fourth");
            for (String str : stringList) {
                System.out.println("Updated ArrayList item: " + str);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}