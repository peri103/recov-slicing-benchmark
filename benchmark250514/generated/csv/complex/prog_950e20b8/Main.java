import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "# This is a comment\nName, Age\nJohn, 30\nDoe, 25";
            
            // Create CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Additional unrelated code to increase complexity
            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("John", 30);
            ageMap.put("Doe", 25);

            ArrayList<String> names = new ArrayList<>();
            names.add("John");
            names.add("Doe");

            int totalAge = 0;
            for (String name : names) {
                totalAge += ageMap.get(name);
            }
            System.out.println("Total Age: " + totalAge);

            // Get the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Further processing of CSV records
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                String age = rec.get("Age");
                System.out.println("Name: " + name + ", Age: " + age);
            }

            // Read the comment from the CSVRecord
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}