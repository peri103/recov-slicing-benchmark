import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Sample CSV content
            String csvContent = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV content using the format
            CSVParser parser = new CSVParser(new StringReader(csvContent), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional logic to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();

            for (CSVRecord record : records) {
                // Extracting name and age
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                names.add(name);
                ages.add(age);
            }

            // Perform some operations on names and ages
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }

            // Read the first record and check consistency
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isConsistent = firstRecord.isConsistent();

            System.out.println("Is the first record consistent? " + isConsistent);

            // Further complex operations
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}