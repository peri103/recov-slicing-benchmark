import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Sample CSV data
        String csvData = "# This is a comment\nName,Age\nJohn,30\nDoe,25";

        // Initialize a list to store parsed records
        List<CSVRecord> records = new ArrayList<>();

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            records = parser.getRecords();

            // Perform some operations on the records
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Print the age map
            System.out.println("Age Map: " + ageMap);

            // Additional unrelated computation
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 natural numbers: " + sum);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("First record comment: " + comment);

            // Another unrelated computation
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 2);
            }

            int product = 1;
            for (Integer number : numbers) {
                product *= number;
            }
            System.out.println("Product of numbers: " + product);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}