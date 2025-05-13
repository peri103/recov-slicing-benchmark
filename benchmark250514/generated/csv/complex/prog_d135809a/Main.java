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
        String csvData = "Name, Age\nJohn, 30\nDoe, 25";
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Using the write method
        /* write */ format = format.withFirstRecordAsHeader();
        
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Additional code to process CSV records
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }
            
            // Calculate average age
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);
            
            // Assuming we want to check if the first record is mapped
            CSVRecord firstRecord = records.get(0);
            
            // More unrelated code
            int maxAge = Integer.MIN_VALUE;
            String oldestPerson = "";
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                if (entry.getValue() > maxAge) {
                    maxAge = entry.getValue();
                    oldestPerson = entry.getKey();
                }
            }
            System.out.println("Oldest Person: " + oldestPerson + ", Age: " + maxAge);
            
            // Using the read method
            /* read */ boolean isMapped = firstRecord.isMapped("Name");
            
            System.out.println("Is 'Name' mapped: " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}