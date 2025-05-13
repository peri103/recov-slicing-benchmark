import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a header comment");

            // Create a sample CSV input
            String csvData = "Name, Age\nJohn, 25\nJane, 30";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(csvData, format);

            // Unrelated code to add complexity
            ArrayList<String> namesList = new ArrayList<>();
            namesList.add("Alice");
            namesList.add("Bob");

            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("Alice", 28);
            ageMap.put("Bob", 32);

            for (String name : namesList) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // More unrelated code
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Retrieve the first record from the parser
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Unrelated data processing
            for (CSVRecord rec : records) {
                System.out.println("Processing record: " + rec);
            }

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the retrieved comment
            System.out.println("CSV Header Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}