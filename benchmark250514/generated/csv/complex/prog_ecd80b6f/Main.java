import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeader("Name", "Age", "Country");

            // Create a sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nAlice,25,UK";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);

            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            HashMap<String, Integer> map = new HashMap<>();
            map.put("John", 30);
            map.put("Alice", 25);

            for (String name : map.keySet()) {
                System.out.println(name + " is " + map.get(name) + " years old.");
            }

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated operations
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Read using isSet method
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("Name");
            System.out.println("Is 'Name' set: " + isNameSet);

            // Additional unrelated operations
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                String age = rec.get("Age");
                String country = rec.get("Country");
                System.out.println(name + " is " + age + " years old from " + country + ".");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}