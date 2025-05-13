import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator('|');

            // Prepare a StringWriter and CSVPrinter to write data
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);

            // Write a record
            printer.printRecord("John", "Doe", "30");
            printer.flush();

            // Use the written data to create a CSVRecord
            String csvData = out.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Simulate complex operations
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("Alice", 25);
            ageMap.put("Bob", 30);
            ageMap.put("Charlie", 35);

            // Process the list and map
            for (String name : names) {
                if (ageMap.containsKey(name)) {
                    System.out.println(name + " is " + ageMap.get(name) + " years old.");
                }
            }

            // Read and print the CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println(recordString);

            // Further data manipulation
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}