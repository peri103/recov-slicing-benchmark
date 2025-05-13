import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 29, New York\nJane Smith, 34, Los Angeles";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Example of unrelated code: Working with ArrayList
            ArrayList<String> namesList = new ArrayList<>();
            for (CSVRecord record : parser.getRecords()) {
                namesList.add(record.get("Name"));
            }

            // Example of unrelated code: Working with HashMap
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : parser.getRecords()) {
                ageMap.put(record.get("Name"), Integer.parseInt(record.get("Age")));
            }

            // Example of more complex logic
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Use the read method
            /* read */ boolean isMapped = firstRecord.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped: " + isMapped);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}