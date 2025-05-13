import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the writer and CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();

            // Additional code for complexity
            HashMap<String, Integer> map = new HashMap<>();
            map.put("key1", 100);
            map.put("key2", 200);
            map.put("key3", 300);

            ArrayList<String> list = new ArrayList<>();
            list.add("element1");
            list.add("element2");
            list.add("element3");

            int sum = 0;
            for (String key : map.keySet()) {
                sum += map.get(key);
            }

            for (String element : list) {
                System.out.println(element);
            }

            // Read the record
            String csvContent = writer.toString();
            CSVParser csvParser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            List<CSVRecord> records = csvParser.getRecords();
            CSVRecord record = records.get(0);

            // Get the value from the record
            /* read */ String value = record.get(0);
            System.out.println(value);

            // Further complexity
            int average = sum / map.size();
            System.out.println("Average: " + average);

            for (int i = 0; i < list.size(); i++) {
                map.put(list.get(i), i * 10);
            }

            for (String key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}