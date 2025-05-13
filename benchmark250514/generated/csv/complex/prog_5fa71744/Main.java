import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');
            
            // Create a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Print multiple records to CSV
            printer.printRecord("value1", "value2");
            printer.printRecord("value3", "value4");
            printer.flush();
            
            // Parse the CSV data into CSVRecord objects
            String csvData = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords();
            
            // Process records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
            }
            
            // Additional unrelated complex operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
            
            // Retrieve and print specific CSVRecord
            CSVRecord specificRecord = records.get(0);
            /* read */ String recordString = specificRecord.toString();
            System.out.println("Specific Record: " + recordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}