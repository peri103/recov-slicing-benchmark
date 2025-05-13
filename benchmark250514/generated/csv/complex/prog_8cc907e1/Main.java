import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance with allow missing column names
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        // Unrelated code: Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Process the list of numbers
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        try {
            // Parse the CSV data using the CSVFormat instance
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = new ArrayList<>();
            for (CSVRecord record : parser) {
                records.add(record);
            }

            // Perform operations on the records
            for (CSVRecord record : records) {
                // Unrelated code: Print each record's content
                System.out.println("Record: " + record);
            }

            // Check if a certain column index is set for the first record
            if (!records.isEmpty()) {
                /* read */ boolean isSet = records.get(0).isSet(1); // Check if the second column is set
                System.out.println("Is column set for first record: " + isSet);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Unrelated code: Further process the list of numbers
        int product = 1;
        for (Integer number : numbers) {
            product *= number + 1;
        }
        System.out.println("Product of numbers + 1: " + product);
    }
}