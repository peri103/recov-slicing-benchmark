import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

        // Sample CSV data
        String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

        // Additional data structure operations
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 28);
        ageMap.put("Bob", 34);

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Perform some operations before reading the comment
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                names.add(name);
                ageMap.put(name, age);
            }

            // Read the header comment
            /* read */ String comment = record.getComment();
            System.out.println("CSV Header Comment: " + comment);

            // Perform operations after reading the comment
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}