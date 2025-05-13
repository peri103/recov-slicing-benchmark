import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        // Prepare CSV data
        String csvData = "name,age\nJohn,30\nJane,25";
        
        // Create a CSVFormat instance and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withFirstRecordAsHeader();
        
        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();
        
        // Unrelated code: Create a map to store names and ages
        Map<String, Integer> nameAgeMap = new HashMap<>();
        
        // Process CSV records and populate the map
        for (CSVRecord record : records) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            nameAgeMap.put(name, age);
        }
        
        // Unrelated code: Calculate the average age
        int totalAge = 0;
        for (int age : nameAgeMap.values()) {
            totalAge += age;
        }
        double averageAge = totalAge / (double) nameAgeMap.size();
        System.out.println("Average age: " + averageAge);
        
        // Read the first record
        CSVRecord firstRecord = records.get(0);
        /* read */ boolean isMapped = firstRecord.isMapped("name");
        
        // Output the result
        System.out.println(isMapped);
        
        // Unrelated code: Print names and ages
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}