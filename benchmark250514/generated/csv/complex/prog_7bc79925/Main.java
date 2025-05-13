import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Sample CSV data with multiple records
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated processing
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();

            // Process each record
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                names.add(name);
                ages.add(age);
            }

            // Perform some operations on the extracted data
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Additional unrelated operations
            List<String> reversedNames = new ArrayList<>(names);
            java.util.Collections.reverse(reversedNames);
            for (String reversedName : reversedNames) {
                System.out.println("Reversed Name: " + reversedName);
            }

            // Read the comment from the first CSV record
            /* read */
            String comment = records.get(0).getComment();
            System.out.println("Header Comment: " + comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}