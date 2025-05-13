import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(); /* write */

        // Sample CSV input
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional unrelated code for complexity
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            ArrayList<String> cities = new ArrayList<>();

            for (CSVRecord record : records) {
                names.add(record.get("name"));
                ages.add(Integer.parseInt(record.get("age")));
                cities.add(record.get("city"));
            }

            // Process the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Calculate average age
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average age: " + averageAge);

            // Read from the first CSV record
            CSVRecord record = records.get(0);
            boolean isSet = record.isSet("age"); /* read */

            // Output the result
            System.out.println("Is 'age' set in the first record? " + isSet);

            // Process the cities list
            for (String city : cities) {
                System.out.println("Processing city: " + city);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}