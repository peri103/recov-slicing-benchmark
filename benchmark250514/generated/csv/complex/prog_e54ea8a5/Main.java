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
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();
            
            // Create a CSVParser to parse some CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Create a list to store CSV records
            ArrayList<CSVRecord> recordsList = new ArrayList<>();
            recordsList.addAll(parser.getRecords());
            
            // Create a map to store additional information
            HashMap<String, String> infoMap = new HashMap<>();
            infoMap.put("John Doe", "Engineer");
            infoMap.put("Jane Smith", "Designer");
            
            // Process each record and print details
            for (CSVRecord record : recordsList) {
                String name = record.get("Name");
                String age = record.get("Age");
                String location = record.get("Location");
                String profession = infoMap.get(name);
                
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Location: " + location);
                System.out.println("Profession: " + profession);
                System.out.println("---------------------------");
            }
            
            // Use the read method to check if a specific header is mapped
            /* read */ boolean isMapped = recordsList.get(0).isMapped("name");
            
            // Output the result of the read method
            System.out.println("Is 'name' mapped: " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}