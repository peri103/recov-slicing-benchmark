import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Prepare a sample CSV content
            String csvContent = "# This is a header comment\n" +
                                "name,age\n" +
                                "Alice,30\n" +
                                "Bob,25";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), format);

            // Additional logic: Create a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Get records
            List<CSVRecord> records = parser.getRecords();

            // Process each record and populate the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                totalAge += entry.getValue();
            }
            System.out.println("Total Age: " + totalAge);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment
            System.out.println(comment);

            // Additional logic: Check if a specific name exists in the map
            if (nameAgeMap.containsKey("Alice")) {
                System.out.println("Alice is found in the records.");
            } else {
                System.out.println("Alice is not found in the records.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}