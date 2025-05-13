import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a header
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "City");
            
            // Sample CSV data
            String csvData = "Name,Age,City\nJohn,30,New York\nJane,25,Los Angeles";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Get the records
            List<CSVRecord> records = parser.getRecords();
            
            // Retrieve the first record
            CSVRecord record = records.get(0);
            
            // Additional operation: Print all records and their headers
            for (CSVRecord rec : records) {
                Map<String, String> recordMap = rec.toMap();
                System.out.println("Record: " + recordMap);
            }
            
            // Additional operation: Calculate average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord rec : records) {
                totalAge += Integer.parseInt(rec.get("Age"));
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average Age: " + averageAge);
            
            // Additional operation: Check if a specific city is listed
            boolean cityFound = false;
            for (CSVRecord rec : records) {
                if ("Los Angeles".equals(rec.get("City"))) {
                    cityFound = true;
                    break;
                }
            }
            System.out.println("Is Los Angeles listed? " + cityFound);
            
            // Check if a header is set (e.g., "Name")
            /* read */ boolean isSet = record.isSet("Name");
            
            // Output the result
            System.out.println("Header 'Name' is set: " + isSet);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}