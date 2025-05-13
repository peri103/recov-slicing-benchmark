import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
        
        try {
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("John", 30);
            ageMap.put("Jane", 25);

            for (CSVRecord record : parser) {
                String name = record.get("Name");
                Integer age = ageMap.get(name);
                System.out.println("Name: " + name + ", Age: " + age);

                // Perform some unrelated computation
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Sum of first 10 numbers: " + sum);

                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);
                break; // Ensure the read method is executed only once
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Additional unrelated code to increase complexity
        Map<String, String> locationMap = new HashMap<>();
        locationMap.put("John", "USA");
        locationMap.put("Jane", "UK");

        for (Map.Entry<String, String> entry : locationMap.entrySet()) {
            System.out.println("Person: " + entry.getKey() + ", Location: " + entry.getValue());
        }
    }
}