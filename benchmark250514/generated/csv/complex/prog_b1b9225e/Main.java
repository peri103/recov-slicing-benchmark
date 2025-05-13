import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVFormat instance with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Use CSVPrinter to write data
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("header1", "header2");
            printer.printRecord("value1", "value2");
            printer.flush();
            
            // Parse the written CSV data
            String csvData = writer.toString();
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            HashMap<String, Integer> map = new HashMap<>();
            map.put("key1", 100);
            map.put("key2", 200);
            map.put("key3", 300);

            for (String key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }

            int sum = 0;
            for (Integer value : map.values()) {
                sum += value;
            }
            System.out.println("Sum of values: " + sum);

            // Read the comment from the first record
            String comment = /* read */ records.get(0).getComment();
            System.out.println(comment);

            // Close resources
            parser.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}