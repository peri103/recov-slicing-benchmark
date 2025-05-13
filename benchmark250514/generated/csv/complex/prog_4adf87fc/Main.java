import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a CSVFormat object with ignoreEmptyLines set to true
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\n\nJane Doe, 25";

            // Parsing the CSV data using the CSVFormat object
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complexity: Process each record and print details
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                System.out.println("Name: " + name + ", Age: " + age);
            }

            // Introduce more unrelated complexity with a simple calculation
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 natural numbers: " + sum);

            // More CSV operations to increase complexity
            int recordCount = 0;
            for (CSVRecord record : records) {
                if (record.isSet("Age")) {
                    recordCount++;
                }
            }
            System.out.println("Number of records with 'Age': " + recordCount);

            // Reading the first record to check if a specific column is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' column set in first record: " + isSet);

            // Additional complexity: Check if all records have a 'Name'
            boolean allHaveNames = true;
            for (CSVRecord record : records) {
                if (!record.isSet("Name")) {
                    allHaveNames = false;
                    break;
                }
            }
            System.out.println("Do all records have a 'Name': " + allHaveNames);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}