import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define CSV data
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Initialize CSVFormat with first record as header
            CSVFormat format = CSVFormat.DEFAULT /* write */.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Process all records and store in a list
            List<Map<String, String>> recordsList = new ArrayList<>();
            for (CSVRecord csvRecord : parser) {
                Map<String, String> recordMap = new HashMap<>();
                for (String header : parser.getHeaderMap().keySet()) {
                    recordMap.put(header, csvRecord.get(header));
                }
                recordsList.add(recordMap);
            }

            // Perform operations on the list of records
            for (Map<String, String> recordMap : recordsList) {
                System.out.println("Name: " + recordMap.get("Name") + ", Age: " + recordMap.get("Age"));
            }

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            
            System.out.println("Is 'Name' mapped: " + isMapped);

            // Additional complex operations
            LinkedList<Integer> ages = new LinkedList<>();
            for (Map<String, String> recordMap : recordsList) {
                ages.add(Integer.parseInt(recordMap.get("Age")));
            }

            Collections.sort(ages);
            System.out.println("Sorted Ages: " + ages);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}