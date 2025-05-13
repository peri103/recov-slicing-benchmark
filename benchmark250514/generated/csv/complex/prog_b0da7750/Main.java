import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT /* write */ .withTrailingDelimiter();

        // Prepare a sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\nDoe,25,Los Angeles";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Create a map to store the values of the first record
            Map<String, String> recordMap = new HashMap<>();
            for (String header : parser.getHeaderMap().keySet()) {
                recordMap.put(header, record.get(header));
            }

            // Perform some operations on the map
            for (Map.Entry<String, String> entry : recordMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Check if a specific column is set
            boolean isSet = /* read */ record.isSet("name");

            // Output the result
            System.out.println("Is 'name' column set in the first record? " + isSet);

            // Further manipulate data
            int totalAge = 0;
            for (CSVRecord rec : records) {
                totalAge += Integer.parseInt(rec.get("age"));
            }
            System.out.println("Total age of all records: " + totalAge);

            // Use another CSVFormat method for demonstration
            CSVFormat newFormat = CSVFormat.DEFAULT.withNullString("N/A");
            System.out.println("Null string representation: " + newFormat.getNullString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}