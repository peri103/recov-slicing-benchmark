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
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter using the default format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSVPrinter
            /* write */ printer.printRecord("value1", "value2", "value3");
            
            // Flush the printer to ensure all data is written to the StringWriter
            printer.flush();
            
            // Some unrelated complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
            
            // Retrieve the CSV content from the StringWriter
            String csvContent = writer.toString();
            
            // Parse the CSV content to extract records
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords();
            
            // More unrelated code
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("A");
            stringList.add("B");
            stringList.add("C");
            for (String str : stringList) {
                System.out.println("String: " + str);
            }
            
            // Read the first record and get the first value
            /* read */ String value = records.get(0).get(0);
            
            // Print the value to the console
            System.out.println("First CSV value: " + value);
            
            // Additional complex operations
            ArrayList<Double> doubleList = new ArrayList<>();
            for (double d = 0.0; d < 5.0; d += 0.5) {
                doubleList.add(d);
            }
            double product = 1.0;
            for (double d : doubleList) {
                product *= d;
            }
            System.out.println("Product of doubles: " + product);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}