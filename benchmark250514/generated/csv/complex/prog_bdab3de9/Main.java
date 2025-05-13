import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(';');
            
            // Prepare a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write data using the CSVFormat
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            
            // Write a record to the CSVPrinter
            csvPrinter.printRecord(Arrays.asList("Alice", "Bob", "Charlie"));
            
            // Close the printer to flush data to the writer
            csvPrinter.close();
            
            // Unrelated code: Create and manipulate a HashMap
            Map<String, Integer> nameMap = new HashMap<>();
            nameMap.put("Alice", 30);
            nameMap.put("Bob", 25);
            nameMap.put("Charlie", 35);

            int sumOfAges = 0;
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                sumOfAges += entry.getValue();
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Read the CSV data as a string
            String csvData = writer.toString();
            
            // Parse the CSV data to a CSVRecord
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);
            
            // More unrelated code: Perform operations on an array
            int[] numbers = {1, 2, 3, 4, 5};
            int product = 1;
            for (int number : numbers) {
                product *= number;
            }
            System.out.println("Product of array elements: " + product);

            // Read the CSVRecord as a string
            /* read */ String recordString = record.toString();
            
            // Print the record string
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}