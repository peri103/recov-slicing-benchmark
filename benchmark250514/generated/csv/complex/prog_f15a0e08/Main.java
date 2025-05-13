import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

            // Create a CSVParser with some sample data
            String csvData = "name,age\nJohn,30\nDoe,25";
            CSVParser parser = CSVParser.parse(csvData, format);

            // Initialize a map to store CSV data
            Map<String, Integer> dataMap = new HashMap<>();

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Process each record and store in the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                dataMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (Integer age : dataMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Access the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

            // Additional operations on the map
            for (String name : dataMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + dataMap.get(name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}