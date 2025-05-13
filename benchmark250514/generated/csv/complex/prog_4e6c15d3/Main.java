import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
            
            // Create a sample CSV input
            String csvData = "name,age\nJohn Doe,30\nJane Smith,25";

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get(0)); // Accessing name column
            }

            // Process names and ages
            List<Integer> ages = new ArrayList<>();
            for (CSVRecord record : records) {
                int age = Integer.parseInt(record.get(1)); // Accessing age column
                ages.add(age);
            }

            // Calculate average age
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Read the first record and print its string representation
            /* read */ String recordString = records.get(0).toString();
            System.out.println("First Record: " + recordString);

            // Print names and ages
            System.out.println("Names and Ages:");
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i) + ", " + ages.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}