import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
            
            // Sample CSV data
            String csvData = "name,age\nJohn Doe,30\nJane Doe,25";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Additional complexity: Process the records
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.isSet("name")) {
                    names.add(record.get("name"));
                }
            }
            
            // Perform some operations on the extracted names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }
            
            // Additional complexity: Calculate average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : records) {
                if (record.isSet("age")) {
                    totalAge += Integer.parseInt(record.get("age"));
                    count++;
                }
            }
            double averageAge = count > 0 ? (double) totalAge / count : 0;
            System.out.println("Average age: " + averageAge);
            
            // Read the first record and check if a column is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("name");
            
            // Output the result
            System.out.println("Is 'name' column set for the first record: " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}