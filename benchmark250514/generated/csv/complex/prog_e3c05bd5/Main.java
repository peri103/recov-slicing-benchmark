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
            // Initialize CSVFormat with a trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Unrelated code to make the program more complex
            ArrayList<String> cities = new ArrayList<>();
            for (CSVRecord record : records) {
                cities.add(record.get("city"));
            }
            System.out.println("Cities: " + cities);

            // More complex operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                sumOfAges += Integer.parseInt(record.get("age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Read a specific record and check if a field is set
            CSVRecord record = records.get(0); // Get the first record
            /* read */ boolean isSet = record.isSet("name");
            
            System.out.println("Is 'name' field set? " + isSet);

            // Additional operations
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord rec : records) {
                names.add(rec.get("name"));
            }
            System.out.println("Names: " + names);

            // Calculate average age
            double averageAge = sumOfAges / (double) records.size();
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}