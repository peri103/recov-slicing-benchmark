import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create CSVPrinter using the format with quote
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSVPrinter
            printer.printRecord("value1", "value2");

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Some complex operations using ArrayList
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Another complex operation using HashMap
            HashMap<String, Integer> map = new HashMap<>();
            map.put("one", 1);
            map.put("two", 2);
            map.put("three", 3);
            int product = 1;
            for (Integer value : map.values()) {
                product *= value;
            }
            System.out.println("Product of map values: " + product);

            // Read the CSV output as a CSVRecord
            String csvOutput = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).getRecords().get(0);

            // Read the record's string representation
            /* read */ String recordString = record.toString();

            // Print the read value
            System.out.println(recordString);

            // More complex operations to increase complexity
            ArrayList<String> strings = new ArrayList<>();
            strings.add("Hello");
            strings.add("World");
            StringBuilder sb = new StringBuilder();
            for (String str : strings) {
                sb.append(str).append(" ");
            }
            System.out.println("Concatenated String: " + sb.toString().trim());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}