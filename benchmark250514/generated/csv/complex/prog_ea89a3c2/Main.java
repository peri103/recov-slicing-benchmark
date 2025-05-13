import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value to the CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Adding unrelated complex code
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            HashMap<String, Integer> map = new HashMap<>();
            map.put("Key1", 100);
            map.put("Key2", 200);

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            for (String key : map.keySet()) {
                System.out.println("Map entry: " + key + " -> " + map.get(key));
            }

            // Initialize a StringReader to read the CSV content
            StringReader reader = new StringReader(writer.toString());

            // Parse the CSV content
            CSVParser csvParser = CSVFormat.DEFAULT.parse(reader);

            // Adding more unrelated code
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Alpha");
            stringList.add("Beta");
            stringList.add("Gamma");

            for (String str : stringList) {
                System.out.println("String from list: " + str);
            }

            // Read the value from the CSV
            CSVRecord record = csvParser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the read value
            System.out.println(value);

            // Adding even more unrelated code
            ArrayList<Double> doubleList = new ArrayList<>();
            for (double i = 1.0; i <= 5.0; i += 0.5) {
                doubleList.add(i * 3.14);
            }

            for (double d : doubleList) {
                System.out.println("Value from double list: " + d);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}