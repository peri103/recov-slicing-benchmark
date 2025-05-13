import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withNullString("NULL");

        // Prepare a CSV input for demonstration
        String csvData = "name,age,city\nJohn,30,NULL\nDoe,NULL,New York";

        // Use StringReader to simulate reading from a file
        Reader reader = new StringReader(csvData);

        try {
            // Parse the CSV data
            CSVParser csvParser = new CSVParser(reader, csvFormat);
            List<CSVRecord> records = csvParser.getRecords();

            // Access the first record and check if a specific column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("age");

            // Output the result
            System.out.println("Is 'age' set in the first record? " + isSet);

            // Additional complex operations
            List<String> names = new ArrayList<>();
            for (CSVRecord rec : records) {
                names.add(rec.get("name"));
            }

            int sumOfAges = 0;
            for (CSVRecord rec : records) {
                String ageStr = rec.get("age");
                if (ageStr != null && !ageStr.equals("NULL")) {
                    sumOfAges += Integer.parseInt(ageStr);
                }
            }

            System.out.println("Names in the CSV: " + names);
            System.out.println("Sum of ages: " + sumOfAges);

            // Close the parser
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}