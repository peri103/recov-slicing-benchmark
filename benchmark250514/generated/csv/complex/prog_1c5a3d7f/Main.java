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
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT.withEscape('\\'); /* write */

            // Create a sample CSV data
            String csvData = "name,age\nJohn Doe,30\nJane Smith,25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated operations
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();

            for (CSVRecord rec : records) {
                names.add(rec.get(0));
                ages.add(Integer.parseInt(rec.get(1)));
            }

            // Perform some calculations
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();

            // Print the names and average age
            System.out.println("Names: " + names);
            System.out.println("Average Age: " + averageAge);

            // Read the first record
            CSVRecord record = records.get(0);
            String recordString = record.toString(); /* read */

            // Print the record string
            System.out.println("First Record: " + recordString);

            // More unrelated operations
            ArrayList<String> reversedNames = new ArrayList<>();
            for (String name : names) {
                reversedNames.add(new StringBuilder(name).reverse().toString());
            }

            // Print reversed names
            System.out.println("Reversed Names: " + reversedNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}