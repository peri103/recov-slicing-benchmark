import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value to the CSV
            /* write */ printer.print("Hello, World!");

            // Adding some unrelated complex logic
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // More complex logic
            List<String> stringList = new ArrayList<>();
            stringList.add("Apple");
            stringList.add("Banana");
            stringList.add("Cherry");

            for (String fruit : stringList) {
                System.out.println(fruit);
            }

            // Close the printer to finalize the output
            printer.close();

            // Read the written value using CSVRecord
            StringReader reader = new StringReader(writer.toString());
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);

            // Retrieve the first record and the first value
            CSVRecord record = records.iterator().next();
            /* read */ String value = record.get(0);

            // Print the value to verify correctness
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}