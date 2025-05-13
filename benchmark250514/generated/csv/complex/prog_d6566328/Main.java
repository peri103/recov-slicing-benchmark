import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with a null string setting
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        
        // Create a sample CSV input
        String csvData = "name,age\nJohn,NULL\nDoe,30";
        
        // Parse the CSV data
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        
        // Get the records
        List<CSVRecord> records = parser.getRecords();
        
        // Initialize a list to store ages
        List<Integer> ages = new ArrayList<>();
        
        // Process each record
        for (CSVRecord record : records) {
            if (record.isSet("age")) {
                String ageStr = record.get("age");
                if (!ageStr.equals("NULL")) {
                    ages.add(Integer.parseInt(ageStr));
                }
            }
        }
        
        // Calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = ages.isEmpty() ? 0 : (double) sum / ages.size();
        System.out.println("Average age: " + averageAge);
        
        // Access the first record
        CSVRecord firstRecord = records.get(0);
        
        // Check if a particular field is set
        /* read */ boolean isSet = firstRecord.isSet("age");
        
        // Output the result
        System.out.println("Is 'age' field set in the first record? " + isSet);
        
        parser.close();
    }
}