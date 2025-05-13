import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true); /* write */

            // Example CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Initialize an ArrayList to store ages
            ArrayList<Integer> ages = new ArrayList<>();

            // Process each CSVRecord to extract and store ages
            for (CSVRecord record : records) {
                if (record.isConsistent()) {
                    String ageString = record.get("age");
                    try {
                        int age = Integer.parseInt(ageString);
                        ages.add(age);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid age format: " + ageString);
                    }
                }
            }

            // Calculate the average age
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = ages.isEmpty() ? 0 : (double) totalAge / ages.size();
            System.out.println("Average age: " + averageAge);

            // Read using the read method
            boolean isConsistent = records.get(0).isConsistent(); /* read */
            System.out.println("Is the first record consistent? " + isConsistent);

            // Additional complexity: Print ages in reverse order
            System.out.println("Ages in reverse order:");
            for (int i = ages.size() - 1; i >= 0; i--) {
                System.out.println(ages.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}