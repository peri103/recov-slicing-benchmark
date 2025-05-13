import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with the first record as header
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Perform some unrelated operations to add complexity
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            Collections.shuffle(numbers);
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of shuffled numbers: " + sum);

            // Read the first record
            CSVRecord firstRecord = records.get(0);

            // Perform more unrelated operations
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            Collections.sort(names);
            for (String name : names) {
                System.out.println("Sorted name: " + name);
            }

            // Check if the 'name' field is mapped
            /* read */
            boolean isMapped = firstRecord.isMapped("name");

            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}