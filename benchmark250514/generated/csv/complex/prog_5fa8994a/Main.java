import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvData = "# This is a comment\nname,age\nJohn,30\n# Another comment\nDoe,25";

        // Create a CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

        // Additional unrelated code to add complexity
        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("Alice", 28);
        nameAgeMap.put("Bob", 34);

        // Iterate through the records and process data
        for (CSVRecord record : parser) {
            // Check for comments and read them
            if (record.hasComment()) {
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }
            
            // Process non-comment records
            if (!record.hasComment()) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                System.out.println("Name: " + name + ", Age: " + age);
                nameAgeMap.put(name, age);
            }
        }

        // Use the map in some way
        System.out.println("Name-Age Map:");
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // More unrelated code for complexity
        int sumOfAges = 0;
        for (int age : nameAgeMap.values()) {
            sumOfAges += age;
        }
        System.out.println("Sum of Ages: " + sumOfAges);

        // Demonstrating another unrelated operation
        int maxAge = nameAgeMap.values().stream().max(Integer::compare).orElse(0);
        System.out.println("Max Age: " + maxAge);
    }
}