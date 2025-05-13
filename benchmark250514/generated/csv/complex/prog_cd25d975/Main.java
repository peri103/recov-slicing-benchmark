import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        // Sample CSV data
        String csvData = "Name,Age,City\nJohn,30,New York\nJane,25,Los Angeles";

        // Create CSVFormat instance with the first record as header
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

        // Parse the CSV data
        CSVParser parser = new CSVParser(new StringReader(csvData), format);

        // Get the records
        List<CSVRecord> records = parser.getRecords();

        // Processing records
        Map<String, Integer> ageMap = new HashMap<>();
        for (CSVRecord rec : records) {
            String name = rec.get("Name");
            int age = Integer.parseInt(rec.get("Age"));
            ageMap.put(name, age);
        }

        // Calculate average age
        int totalAge = 0;
        for (int age : ageMap.values()) {
            totalAge += age;
        }
        double averageAge = totalAge / (double) ageMap.size();
        System.out.println("Average Age: " + averageAge);

        // Access the first record
        CSVRecord record = records.get(0);

        // Some unrelated processing
        Map<String, String> cityMap = new HashMap<>();
        for (CSVRecord rec : records) {
            String name = rec.get("Name");
            String city = rec.get("City");
            cityMap.put(name, city);
        }

        // Output city information
        for (Map.Entry<String, String> entry : cityMap.entrySet()) {
            System.out.println(entry.getKey() + " lives in " + entry.getValue());
        }

        // Check if a specific header is mapped
        /* read */ boolean isMapped = record.isMapped("Name");
        
        // Output the result
        System.out.println("Is 'Name' mapped: " + isMapped);
    }
}