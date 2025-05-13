import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "Name,Age,Location\nAlice,30,New York\nBob,25,Los Angeles";
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withFirstRecordAsHeader();

            // Additional code to make the program more complex
            HashMap<String, Integer> ageMap = new HashMap<>();
            ageMap.put("Alice", 30);
            ageMap.put("Bob", 25);

            ArrayList<String> locations = new ArrayList<>();
            locations.add("New York");
            locations.add("Los Angeles");

            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Performing some operations before the read operation
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                Integer age = ageMap.get(name);
                System.out.println(name + " is " + age + " years old and lives in " + rec.get("Location"));
            }

            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);

            // More complex operations after the read operation
            for (String location : locations) {
                System.out.println("Processing location: " + location);
            }

            int sumAges = 0;
            for (Integer age : ageMap.values()) {
                sumAges += age;
            }
            System.out.println("Sum of ages: " + sumAges);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}