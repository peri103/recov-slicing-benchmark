import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age,city\nJohn,25,New York\nJane,30,Los Angeles";
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Initialize a map to store extracted data
        Map<String, String> personData = new HashMap<>();
        
        try {
            /* write */ format = format.withFirstRecordAsHeader();
            CSVParser parser = format.parse(new StringReader(csvData));
            List<CSVRecord> records = parser.getRecords();
            
            // Process each record and store data in the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                String age = record.get("age");
                String city = record.get("city");
                personData.put(name, "Age: " + age + ", City: " + city);
            }
            
            // Perform some unrelated operations
            int sumAges = 0;
            for (CSVRecord record : records) {
                sumAges += Integer.parseInt(record.get("age"));
            }
            System.out.println("Total age sum: " + sumAges);
            
            // Extract a specific record
            CSVRecord specificRecord = records.get(0);
            String specificName = specificRecord.get("name");
            System.out.println("Specific person's data: " + personData.get(specificName));
            
            // Check if a specific field is mapped
            /* read */ boolean isMapped = specificRecord.isMapped("name");
            System.out.println("Is 'name' field mapped? " + isMapped);
            
            // Further unrelated operations
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                ageMap.put(record.get("name"), Integer.parseInt(record.get("age")));
            }
            
            for (String key : ageMap.keySet()) {
                System.out.println(key + " is " + ageMap.get(key) + " years old.");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}