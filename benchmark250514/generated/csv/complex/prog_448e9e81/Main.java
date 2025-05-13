import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(';');

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York\nAlice;25;Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Retrieve all records
            List<CSVRecord> records = parser.getRecords();

            // Unrelated operations: Using ArrayList to store names
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord rec : records) {
                names.add(rec.get(0)); // Assuming the first column is name
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Hello, " + name);
            }

            // Retrieve the first record
            CSVRecord firstRecord = records.get(0);

            // Perform some unrelated calculations
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);

            // Read the record using toString method
            /* read */ String recordString = firstRecord.toString();

            // Print the record
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}