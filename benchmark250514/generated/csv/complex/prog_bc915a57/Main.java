import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withNullString("NULL");

            // Prepare a sample CSV input
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Create a map to store record details
            Map<String, String> recordMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("name");
                String age = record.get("age");
                recordMap.put(name, age);
            }

            // Perform complex operations on the map
            for (Map.Entry<String, String> entry : recordMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Read from the first record
            CSVRecord record = records.get(0);
            // Perform additional operations before reading
            String firstName = record.get("name");
            System.out.println("First name in the record: " + firstName);

            /* read */ boolean isSet = record.isSet("age");

            // Output the result
            System.out.println("Is 'age' set in the first record? " + isSet);

            // Additional complex logic
            int sumOfAges = 0;
            for (CSVRecord rec : records) {
                String ageString = rec.get("age");
                int age = "NULL".equals(ageString) ? 0 : Integer.parseInt(ageString);
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}