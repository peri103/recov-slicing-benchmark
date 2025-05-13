import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nDoe,25,Los Angeles\n";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Create a list to store names
            List<String> names = new ArrayList<>();

            // Process each record
            for (CSVRecord record : records) {
                // Add names to the list
                names.add(record.get("name"));

                // Just a dummy operation to make the program more complex
                int age = Integer.parseInt(record.get("age"));
                if (age > 20) {
                    System.out.println(record.get("name") + " is older than 20.");
                }
            }

            // Additional complex operations
            List<String> cities = new ArrayList<>();
            for (CSVRecord record : records) {
                String city = record.get("city");
                if (!cities.contains(city)) {
                    cities.add(city);
                }
            }

            // Print all unique cities
            System.out.println("Unique cities:");
            for (String city : cities) {
                System.out.println(city);
            }

            // Get the first record and check if a column is set
            CSVRecord firstRecord = records.get(0);

            // Check if the 'age' column is set in the first record
            /* read */ boolean isAgeSet = firstRecord.isSet("age");

            System.out.println("Is 'age' column set in the first record? " + isAgeSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}