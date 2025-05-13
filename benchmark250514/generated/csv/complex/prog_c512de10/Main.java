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
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Create a sample CSV data with a header comment
            String csvData = "# This is a header comment\n" +
                             "Name, Age\n" +
                             "John, 30\n" +
                             "Jane, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Additional complexity: Process the CSV data
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                names.add(name);
                ages.add(age);
            }

            // Print names and ages
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }

            // Perform some calculations with ages
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Access the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println("Header Comment: " + comment);

            // Additional unrelated complexity: Manipulate an ArrayList
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            // Print the numbers
            for (int number : numbers) {
                System.out.println("Number: " + number);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}