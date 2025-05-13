import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "header1,header2\nvalue1,value2\n,,\nvalue3,value4";
        
        try {
            // Initialize CSVFormat and configure it to ignore empty lines
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Additional data structures and logic to increase complexity
            ArrayList<Map<String, String>> recordList = new ArrayList<>();
            HashMap<String, Integer> headerCount = new HashMap<>();
            
            // Iterate through the records
            for (CSVRecord record : parser) {
                // Check if a specific column is set
                /* read */ boolean isSet = record.isSet("header1");
                System.out.println("Record isSet for 'header1': " + isSet);
                
                // Create a map for each record and add it to the list
                Map<String, String> recordMap = new HashMap<>();
                for (String header : record.toMap().keySet()) {
                    recordMap.put(header, record.get(header));
                    headerCount.put(header, headerCount.getOrDefault(header, 0) + 1);
                }
                recordList.add(recordMap);
            }
            
            // Print the collected records and header counts
            System.out.println("Collected Records:");
            for (Map<String, String> recordMap : recordList) {
                System.out.println(recordMap);
            }
            
            System.out.println("Header Counts:");
            for (Map.Entry<String, Integer> entry : headerCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}