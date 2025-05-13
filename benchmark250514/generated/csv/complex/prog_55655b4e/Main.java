import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(";");

            // Prepare a sample CSV input using the format with a record separator
            String csvData = "name,age\nJohn Doe,30\nJane Smith,25";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);
            
            // Additional unrelated code to increase complexity
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }
            
            // More complex operations
            int sumOfAges = 0;
            for (CSVRecord rec : parser) {
                String ageStr = rec.get("age");
                int age = Integer.parseInt(ageStr);
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Read the first record from the parsed CSV data
            /* read */ CSVRecord record = parser.getRecords().get(0);
            System.out.println(record.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}