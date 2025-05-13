import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize StringWriter and CSVPrinter
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Column1", "Column2");
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Unrelated complex code: Using HashMap to store data
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Key1", 100);
            map.put("Key2", 200);

            // Write multiple values using CSVPrinter
            printer.printRecord("Hello, World!", "Another Value");
            printer.printRecord("Second Record", "Value2");
            /* write */ printer.print("Single Value");
            printer.flush();

            // Unrelated complex code: Perform operations on the HashMap
            int sum = 0;
            for (String key : map.keySet()) {
                sum += map.get(key);
            }
            System.out.println("Sum of values in map: " + sum);

            // Read the written values using CSVParser and CSVRecord
            StringReader reader = new StringReader(writer.toString());
            CSVParser parser = CSVFormat.DEFAULT.withHeader("Column1", "Column2").parse(reader);
            List<CSVRecord> records = parser.getRecords();

            // Assuming we're interested in the first record and the first column
            if (!records.isEmpty()) {
                for (CSVRecord record : records) {
                    String column1Value = record.get("Column1");
                    String column2Value = record.get("Column2");
                    System.out.println("Record: " + column1Value + ", " + column2Value);
                }
                /* read */ String value = records.get(2).get("Column1");
                System.out.println("Read specific value: " + value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}