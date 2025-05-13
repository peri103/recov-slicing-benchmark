import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        try {
            /* write */ csvFormat = csvFormat.withFirstRecordAsHeader();
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }
            
            // Some unrelated complex operations
            int sumOfAges = 0;
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                sumOfAges += entry.getValue();
            }
            System.out.println("Sum of ages: " + sumOfAges);
            
            // More complex operations
            int averageAge = sumOfAges / ageMap.size();
            System.out.println("Average age: " + averageAge);
            
            // Use of the original read method
            CSVRecord record = parser.getRecords().get(0);
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}