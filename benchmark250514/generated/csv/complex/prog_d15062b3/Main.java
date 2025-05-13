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
            // Create a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Initialize CSVPrinter with default format
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data to CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Additional complex logic
            ArrayList<String> list = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();
            list.add("First");
            list.add("Second");
            map.put("First", 1);
            map.put("Second", 2);

            // Processing list and map
            for (String item : list) {
                if (map.containsKey(item)) {
                    System.out.println("Map contains: " + item + " with value " + map.get(item));
                }
            }

            // Parse the CSV data
            StringReader reader = new StringReader(writer.toString());
            CSVParser csvParser = CSVFormat.DEFAULT.parse(reader);
            
            // More unrelated complex logic
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Read data from CSV
            CSVRecord record = csvParser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Output the read value
            System.out.println(value);

            // Further complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }
            for (int num : numbers) {
                System.out.println("Number: " + num);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}