import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nDoe,25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Unrelated complex code: Using a HashMap to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (String name : nameAgeMap.keySet()) {
                totalAge += nameAgeMap.get(name);
            }
            System.out.println("Total age: " + totalAge);

            // Read from the first record using the read method
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            
            // Print the result
            System.out.println("Is the first record consistent? " + isConsistent);

            // Additional operations on the map
            for (String name : nameAgeMap.keySet()) {
                System.out.println(name + " is " + nameAgeMap.get(name) + " years old.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}