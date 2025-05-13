import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Sample CSV data with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Create a map to store header-value pairs
            HashMap<String, String> csvDataMap = new HashMap<>();
            ArrayList<String> headers = new ArrayList<>();
            
            // Iterate over the records
            for (CSVRecord record : parser) {
                if (headers.isEmpty()) {
                    // Store headers from the first record
                    headers.add(record.get(0));
                    headers.add(record.get(1));
                } else {
                    // Store values in the map
                    csvDataMap.put(headers.get(0), record.get(0));
                    csvDataMap.put(headers.get(1), record.get(1));
                }
            }
            
            // Perform some operations on the map
            for (String header : headers) {
                System.out.println(header + ": " + csvDataMap.get(header));
            }
            
            // Read the comment from the first record
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }
            
            // Additional complexity: Reverse the map and print
            HashMap<String, String> reversedMap = new HashMap<>();
            for (String key : csvDataMap.keySet()) {
                reversedMap.put(csvDataMap.get(key), key);
            }
            
            for (String value : reversedMap.keySet()) {
                System.out.println(value + " maps to " + reversedMap.get(value));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}