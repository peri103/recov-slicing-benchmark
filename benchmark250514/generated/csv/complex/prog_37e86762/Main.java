import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withQuote('"');

            // Create a sample CSV data
            String csvData = "\"Name\",\"Age\"\n\"Alice\",\"30\"\n\"Bob\",\"25\"";

            // Parse the CSV data
            CSVParser parser = csvFormat.parse(new StringReader(csvData));
            List<CSVRecord> records = parser.getRecords();

            // Additional operations to make the program more complex
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();

            for (CSVRecord record : records) {
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
            }

            // Perform some operations on the names and ages lists
            int sumOfAges = 0;
            for (int age : ages) {
                sumOfAges += age;
            }

            String concatenatedNames = String.join(", ", names);

            // Output the results of additional operations
            System.out.println("Sum of ages: " + sumOfAges);
            System.out.println("Concatenated names: " + concatenatedNames);

            // Read a CSVRecord and convert it to a String
            /* read */ String recordString = records.get(0).toString();

            // Output the CSVRecord as a String
            System.out.println(recordString);

            // Additional unrelated code
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            for (int number : numbers) {
                System.out.println("Number: " + number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}