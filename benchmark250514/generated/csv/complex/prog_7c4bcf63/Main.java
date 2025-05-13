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
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                    /* write */ .withHeaderComments("Comment1", "Comment2");

            // Sample CSV data
            String csvData = "Name,Age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize an ArrayList to store names
            ArrayList<String> names = new ArrayList<>();

            // Get all records and store names
            List<CSVRecord> records = parser.getRecords();
            for (CSVRecord rec : records) {
                names.add(rec.get("Name"));
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Get the first record
            CSVRecord record = records.get(0);

            // Some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Header Comment: " + comment);

            // Additional complex operations
            ArrayList<Integer> ages = new ArrayList<>();
            for (CSVRecord rec : records) {
                ages.add(Integer.parseInt(rec.get("Age")));
            }

            int ageSum = 0;
            for (int age : ages) {
                ageSum += age;
            }
            System.out.println("Total sum of ages: " + ageSum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}