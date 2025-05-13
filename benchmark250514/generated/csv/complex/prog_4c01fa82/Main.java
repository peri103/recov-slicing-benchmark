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
            // Initialize CSVFormat with a trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Prepare a list to store CSV records
            List<CSVRecord> records = new ArrayList<>();

            // Process each CSV record
            for (CSVRecord record : parser) {
                records.add(record);
            }

            // Perform some unrelated operations on the records
            for (CSVRecord record : records) {
                String name = record.get("name");
                System.out.println("Name: " + name);
            }

            // Check if a specific column is set for the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("age");
            System.out.println("Is 'age' column set? " + isSet);

            // Additional operations on CSV records
            for (CSVRecord record : records) {
                String city = record.get("city");
                System.out.println("City: " + city);
            }

            // Perform calculations based on the age column
            int totalAge = 0;
            for (CSVRecord record : records) {
                int age = Integer.parseInt(record.get("age"));
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}