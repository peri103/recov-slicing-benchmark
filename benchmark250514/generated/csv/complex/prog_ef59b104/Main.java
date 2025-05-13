import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        
        try {
            // Initialize CSVPrinter
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record
            /* write */ printer.printRecord("value1", "value2", "value3");

            // Additional unrelated code
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 5);
            }

            HashMap<String, Integer> map = new HashMap<>();
            map.put("A", 1);
            map.put("B", 2);
            map.put("C", 3);

            // Process the array list
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    map.put("Even", number);
                }
            }

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Parse the written data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // More unrelated processing
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the value
            System.out.println("First value from CSV: " + value);

            // Additional processing with map
            int total = 0;
            for (String key : map.keySet()) {
                total += map.get(key);
            }
            System.out.println("Total from map: " + total);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}