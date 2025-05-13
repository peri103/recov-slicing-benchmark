import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(); // Set the format to ignore surrounding spaces

            // Parse CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<Map<String, String>> recordsList = new ArrayList<>();
            for (CSVRecord record : parser) {
                Map<String, String> recordMap = new HashMap<>();
                recordMap.put("name", record.get("name"));
                recordMap.put("age", record.get("age"));
                recordsList.add(recordMap);
            }
            parser.close();

            // Process records
            for (Map<String, String> record : recordsList) {
                System.out.println("Name: " + record.get("name") + ", Age: " + record.get("age"));
            }

            // Check consistency of records
            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent(); // Check if the record is consistent
                System.out.println("Record is consistent: " + isConsistent);
            }

            // Additional complexity: Calculate average age
            int totalAge = 0;
            for (Map<String, String> record : recordsList) {
                totalAge += Integer.parseInt(record.get("age"));
            }
            double averageAge = (double) totalAge / recordsList.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}