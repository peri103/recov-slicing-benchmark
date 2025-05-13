import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Additional data manipulation
            ArrayList<String> list = new ArrayList<>();
            list.add("Data1");
            list.add("Data2");

            HashMap<String, Integer> map = new HashMap<>();
            map.put("Key1", 100);
            map.put("Key2", 200);

            for (String item : list) {
                System.out.println("List item: " + item);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Map entry: " + entry.getKey() + " = " + entry.getValue());
            }

            // Read the value using CSVRecord
            Reader reader = new StringReader(writer.toString());
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the value
            System.out.println(value);

            // Additional logic to make the program complex
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Close resources
            csvPrinter.close();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}