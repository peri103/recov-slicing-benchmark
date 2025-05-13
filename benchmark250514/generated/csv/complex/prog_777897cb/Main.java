import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the output of CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");

            // Flush and close the CSVPrinter
            csvPrinter.flush();
            csvPrinter.close();

            // Unrelated complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            System.out.println("Sum of numbers: " + sum);

            // More complex operations
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Apple");
            stringList.add("Banana");
            stringList.add("Cherry");

            for (String fruit : stringList) {
                System.out.println("Fruit: " + fruit);
            }

            // Read the value using CSVRecord
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();
            CSVRecord record = records.get(0);

            // Retrieve the value using the 'get' method
            /* read */ String value = record.get(0);
            System.out.println(value);

            // Additional unrelated operations
            ArrayList<Double> decimalList = new ArrayList<>();
            for (double d = 0.5; d < 5.0; d += 0.5) {
                decimalList.add(d);
            }

            for (double decimal : decimalList) {
                System.out.println("Decimal: " + decimal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}