import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name, Age\nJohn, 30\nDoe, 25";

            // Initialize CSVFormat and add header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("Header Comment");

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a list of CSV records
            List<CSVRecord> records = new ArrayList<>();
            records.addAll(parser.getRecords());

            // Create a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Populate the map with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                totalAge += entry.getValue();
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ String comment = firstRecord.getComment();

            // Output the comment
            System.out.println(comment);

            // Print all names
            System.out.println("Names in CSV:");
            for (String name : nameAgeMap.keySet()) {
                System.out.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}