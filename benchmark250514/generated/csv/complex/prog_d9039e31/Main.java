import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a header comment");

            // Create a sample CSV string
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Create a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Populate the map with data from records
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the retrieved comment
            System.out.println(comment);

            // Additional operations to make the program more complex
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}