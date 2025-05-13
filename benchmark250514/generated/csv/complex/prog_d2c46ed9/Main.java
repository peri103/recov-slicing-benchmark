import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name, Age, City\nAlice, 30, New York\nBob, 25, Los Angeles";
            
            // Configure CSVFormat with write method
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Additional code to make program complex
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                ageMap.put(name, age);
            }
            
            // Use read method on the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isSet);
            
            // More complex operations with the map
            for (String name : ageMap.keySet()) {
                int age = ageMap.get(name);
                System.out.println(name + " is " + age + " years old.");
            }
            
            // Additional CSV operations
            CSVFormat formatWithHeader = CSVFormat.DEFAULT.withHeader("Name", "Age", "City");
            CSVParser parserWithHeader = CSVParser.parse(new StringReader(csvData), formatWithHeader);
            List<CSVRecord> recordsWithHeader = parserWithHeader.getRecords();
            
            for (CSVRecord recWithHeader : recordsWithHeader) {
                System.out.println("Name: " + recWithHeader.get("Name"));
                System.out.println("City: " + recWithHeader.get("City"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}