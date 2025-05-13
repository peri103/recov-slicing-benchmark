import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,25,USA\nJane,30,UK";

        try {
            // Create a CSVFormat object with the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord rec : records) {
                sumOfAges += Integer.parseInt(rec.get("Age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Check if a specific header is mapped (e.g., "Name")
            /* read */ boolean isNameMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isNameMapped);

            // Perform further operations
            for (CSVRecord rec : records) {
                Map<String, String> recordMap = rec.toMap();
                for (String key : recordMap.keySet()) {
                    System.out.println(key + ": " + recordMap.get(key));
                }
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}