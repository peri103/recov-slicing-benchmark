import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            
            // Create a sample CSV input
            String csvData = "name,age\nJohn,30\nJane,25";
            
            // Parse the CSV data using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Retrieve all records
            List<CSVRecord> records = parser.getRecords();
            
            // Initialize a map to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            
            // Iterate over the records to populate the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }
            
            // Perform a complex operation: calculate the average age
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);
            
            // Retrieve the first record
            CSVRecord firstRecord = records.get(0);
            
            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);
            
            // Read the comment from the first record
            /* read */ String comment = firstRecord.getComment();
            
            // Output the comment
            System.out.println(comment);
            
            // Perform another unrelated operation
            int factorial = 1;
            for (int i = 1; i <= 5; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of 5: " + factorial);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}