import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');

            // Prepare data to write
            List<String> data = Arrays.asList("John", "Doe", "john.doe@example.com");

            // Use StringWriter to capture the CSV output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);
            printer.printRecord(data);
            printer.flush();

            // Additional unrelated operations
            Map<String, Integer> map = new HashMap<>();
            map.put("Alice", 25);
            map.put("Bob", 30);
            map.put("Charlie", 35);

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // More complex operations
            List<String> additionalData = Arrays.asList("Jane", "Smith", "jane.smith@example.com");
            CSVPrinter printer2 = new CSVPrinter(out, format);
            printer2.printRecord(additionalData);
            printer2.flush();

            String csvContent = out.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords();

            // Process all records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
            }

            // Read the first CSVRecord
            CSVRecord firstRecord = records.get(0);
            /* read */ String recordString = firstRecord.toString();
            System.out.println("First Record: " + recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}