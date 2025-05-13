import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Create a sample CSV string
            String csvData = "name;age;location\nJohn Doe;30;USA\nJane Smith;25;Canada";

            // Parse the CSV string using the format with the custom delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Process each record and store their string representations
            List<String> recordStrings = new ArrayList<>();
            for (CSVRecord record : parser) {
                recordStrings.add(record.toString());
            }

            // Unrelated complex logic
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                numbers.add(i);
            }
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers from 1 to 10: " + sum);

            // Read the first record
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ String recordString = firstRecord.toString();

            // Output the record string
            System.out.println("First record: " + recordString);

            // Output all record strings
            System.out.println("All records:");
            for (String recStr : recordStrings) {
                System.out.println(recStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}