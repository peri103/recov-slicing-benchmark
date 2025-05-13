import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
            /* write */ format = format.withEscape('\\');

            // Prepare a CSV string to parse
            String csvData = "name,age\nJohn Doe,30\nJane Smith,25";

            // Parse the CSV string using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional logic: Create a map to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();

            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                nameAgeMap.put(name, age);
            }

            // Process the map to find the oldest person
            String oldestPerson = null;
            int maxAge = 0;
            for (String name : nameAgeMap.keySet()) {
                int age = nameAgeMap.get(name);
                if (age > maxAge) {
                    maxAge = age;
                    oldestPerson = name;
                }
            }

            System.out.println("Oldest person: " + oldestPerson + " with age " + maxAge);

            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}