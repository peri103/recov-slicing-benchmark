import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
            
            // Create a CSV string to parse
            String csvData = "\"Name\",\"Age\",\"City\"\n\"John Doe\",\"30\",\"New York\"";
            
            // Parse the CSV string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Initialize a list to store CSV records
            List<CSVRecord> records = new ArrayList<>();
            
            // Add all records to the list
            records.addAll(parser.getRecords());
            
            // Initialize a map to store record details
            Map<String, String> recordDetails = new HashMap<>();
            
            // Process each record and store details in the map
            for (CSVRecord record : records) {
                recordDetails.put(record.get(0), record.get(2));
            }
            
            // Print the map
            System.out.println("Record Details: " + recordDetails);
            
            // Some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Read the first record
            CSVRecord firstRecord = records.get(0);
            
            // Use the toString method of CSVRecord
            /* read */ String recordString = firstRecord.toString();
            System.out.println("First Record: " + recordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}