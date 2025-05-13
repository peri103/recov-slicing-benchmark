import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSV format with a header
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,Canada";

            // Parse the CSV data using the format with header
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Additional processing on the records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.isSet("Name")) {
                    names.add(record.get("Name"));
                }
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Access the first record and check if a header is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isNameSet = firstRecord.isSet("Name");

            System.out.println("Is 'Name' header set in the first record? " + isNameSet);

            // Additional unrelated code to increase complexity
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}