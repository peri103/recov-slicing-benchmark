import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            HashMap<String, List<String>> dataMap = new HashMap<>();
            List<String> records = new ArrayList<>();
            records.add("Value1");
            records.add("Value2");
            dataMap.put("Key1", records);

            /* write */ format = format.withQuote('"');

            // Use the format to write data
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("Example", "Data", "123");
            printer.printRecord("Another", "Row", "456");
            printer.flush();

            // Unrelated code to add complexity
            List<String> extraData = new ArrayList<>();
            extraData.add("Extra1");
            extraData.add("Extra2");
            dataMap.put("Key2", extraData);

            for (String key : dataMap.keySet()) {
                System.out.println("Key: " + key + ", Values: " + dataMap.get(key));
            }

            // Parse the written data into a CSVRecord for reading
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).iterator().next();

            // Unrelated code to process the map data
            for (String key : dataMap.keySet()) {
                List<String> values = dataMap.get(key);
                for (String value : values) {
                    System.out.println("Processing value: " + value);
                }
            }

            /* read */ String value = record.toString();
            System.out.println(value);

            // Additional unrelated operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            for (Integer number : numbers) {
                System.out.println("Number: " + number);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}