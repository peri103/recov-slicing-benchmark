import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Create a sample CSV data
            String csvData = "name;age;city\nJohn Doe;30;New York\nJane Doe;25;Los Angeles";

            // Parse the CSV data using the format with the specified delimiter
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Process each record and store in an ArrayList
            ArrayList<String> processedRecords = new ArrayList<>();
            for (CSVRecord record : records) {
                processedRecords.add(record.toString());
            }

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                sumOfAges += Integer.parseInt(record.get(1));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // More unrelated operations
            ArrayList<String> cities = new ArrayList<>();
            for (CSVRecord record : records) {
                cities.add(record.get(2));
            }
            System.out.println("Cities: " + cities);

            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();

            // Output the record string
            System.out.println(recordString);

            // Additional operations on processed records
            for (String rec : processedRecords) {
                System.out.println("Processed Record: " + rec);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}