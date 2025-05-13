import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withTrailingDelimiter();

        // Sample CSV data
        String csvData = "name,age,city\nJohn,23,New York\nJane,29,Los Angeles\n";

        // Parse the CSV data
        List<CSVRecord> records = null;
        try {
            records = csvFormat.parse(new StringReader(csvData)).getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Initialize a map to store CSV records by name
        Map<String, CSVRecord> recordMap = new HashMap<>();
        if (records != null) {
            for (CSVRecord record : records) {
                String name = record.get("name");
                recordMap.put(name, record);
            }
        }

        // Perform operations on the map
        CSVRecord johnRecord = recordMap.get("John");
        if (johnRecord != null) {
            System.out.println("John's age: " + johnRecord.get("age"));
        }

        CSVRecord janeRecord = recordMap.get("Jane");
        if (janeRecord != null) {
            System.out.println("Jane's city: " + janeRecord.get("city"));
        }

        // Access a CSVRecord
        CSVRecord record = records.get(0);

        // Check if a specific column is set
        /* read */ boolean isSet = record.isSet("name");
        System.out.println("Is 'name' set in the first record? " + isSet);

        // Additional operations to make the program more complex
        int totalAge = 0;
        for (CSVRecord rec : records) {
            totalAge += Integer.parseInt(rec.get("age"));
        }
        System.out.println("Total age: " + totalAge);

        // Check for a column in the second record
        boolean isCitySet = records.get(1).isSet("city");
        System.out.println("Is 'city' set in the second record? " + isCitySet);
    }
}