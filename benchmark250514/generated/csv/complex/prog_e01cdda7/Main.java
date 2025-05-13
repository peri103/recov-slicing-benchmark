import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format with escape character
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional code to increase complexity
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                nameAgeMap.put(name, age);
            }

            // Process the map to find the oldest person
            String oldestPerson = null;
            int maxAge = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                if (entry.getValue() > maxAge) {
                    maxAge = entry.getValue();
                    oldestPerson = entry.getKey();
                }
            }

            // Print the name of the oldest person
            System.out.println("Oldest person: " + oldestPerson);

            // Read the first record as a string
            /* read */ String firstRecordString = records.get(0).toString();
            System.out.println(firstRecordString);

            // Additional code to manipulate the map
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}