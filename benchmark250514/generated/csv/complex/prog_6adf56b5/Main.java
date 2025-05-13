import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Sample CSV data with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Create a collection to store records
            ArrayList<CSVRecord> recordList = new ArrayList<>();
            
            // Iterate over the records and store them
            for (CSVRecord record : parser) {
                recordList.add(record);
            }
            
            // Process records and store data in a map
            Map<String, String> dataMap = new HashMap<>();
            for (CSVRecord record : recordList) {
                String header1Value = record.get("header1");
                String header2Value = record.get("header2");
                dataMap.put(header1Value, header2Value);
            }
            
            // Perform some operations on the data map
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            
            // Read the comment from the first record
            /* read */ String comment = recordList.get(0).getComment();
            if (comment != null) {
                System.out.println("Comment: " + comment);
            } else {
                System.out.println("No comment found.");
            }
            
            // Additional complex operations
            int sum = 0;
            for (CSVRecord record : recordList) {
                sum += record.get(0).length();
            }
            System.out.println("Sum of lengths of first column values: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}