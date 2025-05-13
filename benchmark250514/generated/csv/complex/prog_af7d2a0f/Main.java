import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Prepare a sample CSV input
        String csvData = "header1,header1\nvalue1,value2";

        // Additional unrelated code to increase complexity
        ArrayList<String> list = new ArrayList<>();
        list.add("Sample");
        list.add("Data");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);

        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Further unrelated operations
            int counter = 0;
            for (String item : list) {
                System.out.println("List item: " + item);
                counter++;
            }

            // Read using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("header1");

            // Output the result
            System.out.println("Is 'header1' mapped: " + isMapped);

            // Additional unrelated operations after the read
            for (CSVRecord rec : records) {
                for (String field : rec) {
                    System.out.println("Field: " + field);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}