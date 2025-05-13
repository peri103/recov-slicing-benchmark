import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\nDoe,40";
        
        try {
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withFirstRecordAsHeader();
            
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }
            
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            CSVRecord record = records.get(0);
            // More operations before reading
            boolean isNameMapped = record.isMapped("name");
            boolean isAgeMapped = record.isMapped("age");
            System.out.println("Is 'age' mapped: " + isAgeMapped);
            
            /* read */ boolean isMapped = isNameMapped;
            System.out.println("Is 'name' mapped: " + isMapped);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}