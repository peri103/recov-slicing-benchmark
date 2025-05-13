import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ printer.printRecord("value1", "value2", "value3");
            printer.flush();

            // Complex operations with different data structures
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("element1");
            arrayList.add("element2");
            arrayList.add("element3");

            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("key1", 10);
            hashMap.put("key2", 20);
            hashMap.put("key3", 30);

            int sum = 0;
            for (String key : hashMap.keySet()) {
                sum += hashMap.get(key);
            }
            System.out.println("Sum of HashMap values: " + sum);

            // More operations on the ArrayList
            for (String element : arrayList) {
                System.out.println("ArrayList element: " + element);
            }

            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            CSVRecord record = records.get(0);

            // Additional complex operations
            int product = 1;
            for (int i = 1; i <= 5; i++) {
                product *= i;
            }
            System.out.println("Product of numbers 1 to 5: " + product);

            /* read */ String value = record.get(0);
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}