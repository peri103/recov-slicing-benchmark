import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');

        // Create a sample CSV string
        String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";
        
        // Parse the CSV string using the format with the specified delimiter
        List<CSVRecord> records = null;
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Jane", 25);

        for (String name : ageMap.keySet()) {
            System.out.println("Age of " + name + " is " + ageMap.get(name));
        }

        // More complex operations using CSVRecord
        if (records != null && !records.isEmpty()) {
            for (CSVRecord record : records) {
                String name = record.get(0);
                String age = record.get(1);
                String city = record.get(2);
                System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
            }
        }

        // Read the first record and convert it to a string
        if (records != null && !records.isEmpty()) {
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        }

        // Further unrelated operations to increase complexity
        int sumOfAges = ageMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ages: " + sumOfAges);
    }
}