import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Create a CSVParser to parse a sample CSV input
            String csvData = "name,age\nJohn,30\nDoe,25";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Additional code to make the program more complex
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            // Process the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Get the first record from the parser
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Perform some operations with the records
            for (CSVRecord rec : records) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                System.out.println("Name: " + name + ", Age: " + age);
            }

            // Read the comment from the record
            /* read */
            String comment = record.getComment();
            System.out.println(comment);

            // More complex operations
            int sumOfAges = 0;
            for (CSVRecord rec : records) {
                sumOfAges += Integer.parseInt(rec.get("age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}