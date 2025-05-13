import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

        // Create a sample CSV input
        String csvData = "name,age\nJohn Doe,30\nJane Doe,25";

        // Parse the CSV data
        Reader in = new StringReader(csvData);
        CSVParser parser = new CSVParser(in, format);

        // Retrieve the records
        List<CSVRecord> records = parser.getRecords();

        // Create a map to store names and ages
        Map<String, Integer> nameAgeMap = new HashMap<>();

        // Process each record to populate the map
        for (CSVRecord record : records) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            nameAgeMap.put(name, age);
        }

        // Print all names and ages
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Access the comment from the first record
        if (!records.isEmpty()) {
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Comment: " + comment);
        }

        // Calculate the average age
        int totalAge = 0;
        for (int age : nameAgeMap.values()) {
            totalAge += age;
        }
        double averageAge = (double) totalAge / nameAgeMap.size();
        System.out.println("Average Age: " + averageAge);

        // Check if a specific name exists in the map
        String searchName = "Jane Doe";
        if (nameAgeMap.containsKey(searchName)) {
            System.out.println(searchName + " is in the list with age " + nameAgeMap.get(searchName));
        } else {
            System.out.println(searchName + " is not in the list.");
        }
    }
}