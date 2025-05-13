import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record into the CSV
            /* write */ printer.printRecord("value1", "value2", "value3");

            // Flush the printer to ensure all data is written
            printer.flush();

            // Initialize a map to store some unrelated data
            Map<String, Integer> dataMap = new HashMap<>();
            dataMap.put("key1", 100);
            dataMap.put("key2", 200);

            // Perform some operations with the map
            int sum = 0;
            for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
                sum += entry.getValue();
            }
            System.out.println("Sum of values in map: " + sum);

            // Parse the written CSV data using CSVParser
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Perform additional operations on the parsed CSV data
            int recordCount = 0;
            for (CSVRecord rec : parser) {
                recordCount++;
                System.out.println("Record " + recordCount + ": " + rec);
            }

            // Read the first record from the parser
            CSVRecord record = parser.getRecords().get(0);

            // Retrieve the first value from the record
            /* read */ String value = record.get(0);

            // Print the retrieved value
            System.out.println("First value from CSV: " + value);

            // Close resources
            printer.close();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}