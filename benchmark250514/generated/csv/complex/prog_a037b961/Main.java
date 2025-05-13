import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT /* write */ .withIgnoreSurroundingSpaces();

        // Prepare a sample CSV data
        String csvData = "Name, Age\nJohn, 30\nJane, 25";

        try {
            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create an unrelated list of names
            ArrayList<String> namesList = new ArrayList<>();
            namesList.add("Alice");
            namesList.add("Bob");
            namesList.add("Charlie");

            // Perform operations on the list
            for (String name : namesList) {
                System.out.println("Name: " + name);
            }

            // Access the first record
            CSVRecord record = records.get(0);

            // Perform some unrelated calculations
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Use the read method to check consistency
            /* read */ boolean isConsistent = record.isConsistent();

            // Print the result
            System.out.println("Is the record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}