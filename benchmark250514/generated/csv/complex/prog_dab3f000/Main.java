import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();

            // Initialize CSVPrinter
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data to CSV
            /* write */ printer.print("Hello, World!");

            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Close the printer to flush the data to the writer
            printer.flush();

            // Parse the CSV data from the writer
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Additional unrelated operations
            ArrayList<String> strings = new ArrayList<>();
            strings.add("Apple");
            strings.add("Banana");
            strings.add("Cherry");
            for (String fruit : strings) {
                System.out.println("Fruit: " + fruit);
            }

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the first value from the record
            /* read */ String value = record.get(0);

            // Print the value
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}