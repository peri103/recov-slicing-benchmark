import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */ .withAllowMissingColumnNames(true);
            
            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25\n";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            System.out.println("Numbers list: " + numbers);

            // Perform some operations on the CSV records
            for (CSVRecord rec : records) {
                System.out.println("Record: " + rec);
            }

            // Read the first record using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            
            // Output the result
            System.out.println("Is the first record consistent? " + isConsistent);

            // More complex operations
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}