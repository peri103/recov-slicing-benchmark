import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Prepare a sample CSV input
        String csvData = "name,age,city\nJohn,NULL,New York\nDoe,30,San Francisco";

        try {
            // Parse the CSV data using the format with null string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Process each record and store information in a map
            Map<String, String> userInfo = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get("name");
                String age = record.get("age");
                String city = record.get("city");

                // Store the user's information in the map
                userInfo.put(name, "Age: " + age + ", City: " + city);
            }

            // Additional processing: Calculate average age ignoring NULL values
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : parser) {
                if (record.isSet("age")) {
                    try {
                        int age = Integer.parseInt(record.get("age"));
                        totalAge += age;
                        count++;
                    } catch (NumberFormatException e) {
                        // Ignore non-integer age values
                    }
                }
            }

            // Calculate average age
            double averageAge = count > 0 ? (double) totalAge / count : 0;

            // Print user information and average age
            for (Map.Entry<String, String> entry : userInfo.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Average Age (excluding NULL): " + averageAge);

            // Read the first record and check if the 'age' field is set
            List<CSVRecord> records = parser.getRecords();
            if (!records.isEmpty()) {
                CSVRecord firstRecord = records.get(0);
                /* read */ boolean isAgeSet = firstRecord.isSet("age");
                // Print the result
                System.out.println("Is 'age' set in the first record? " + isAgeSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}