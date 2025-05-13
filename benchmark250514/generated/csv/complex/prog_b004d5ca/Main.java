import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Unrelated logic to make the program more complex
            HashMap<String, Integer> ageMap = new HashMap<>();
            ageMap.put("John", 30);
            ageMap.put("Doe", 25);

            List<CSVRecord> records = parser.getRecords();
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                Integer age = ageMap.get(name);
                System.out.println("Name: " + name + ", Age from Map: " + age);
            }

            // Read the first record
            CSVRecord record = records.get(0);

            // Additional complex logic
            int totalAge = 0;
            for (CSVRecord rec : records) {
                totalAge += Integer.parseInt(rec.get("Age"));
            }
            System.out.println("Total Age: " + totalAge);

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");

            System.out.println("Is 'Name' mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}