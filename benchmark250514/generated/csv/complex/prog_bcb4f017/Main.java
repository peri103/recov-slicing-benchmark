import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Prepare a CSV string with header and data
            String csvData = "Name,Age\nJohn Doe,30\nJane Doe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Unrelated complex operations using HashMap
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some calculations on the age data
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Further unrelated operations
            for (String name : ageMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Output the comment
            System.out.println(comment);

            // Additional unrelated operations
            int maxAge = Integer.MIN_VALUE;
            for (Integer age : ageMap.values()) {
                if (age > maxAge) {
                    maxAge = age;
                }
            }
            System.out.println("Max Age: " + maxAge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}