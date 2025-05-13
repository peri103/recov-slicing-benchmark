import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        // Prepare a sample CSV input
        String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

        // Parse the CSV data using the format
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();

            for (CSVRecord record : parser) {
                HashMap<String, String> recordMap = new HashMap<>();
                recordMap.put("Name", record.get("Name"));
                recordMap.put("Age", record.get("Age"));
                recordsList.add(recordMap);
            }

            // Perform some operations on the recordsList
            for (HashMap<String, String> map : recordsList) {
                System.out.println("Name: " + map.get("Name") + ", Age: " + map.get("Age"));
            }

            // Check consistency of the first record
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ boolean isConsistent = firstRecord.isConsistent();
            System.out.println("First record is consistent: " + isConsistent);

            // Additional operations to increase complexity
            int totalAge = 0;
            for (HashMap<String, String> map : recordsList) {
                totalAge += Integer.parseInt(map.get("Age"));
            }
            System.out.println("Total Age: " + totalAge);

            // Another example of using a CSVFormat method
            CSVFormat newFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase();
            System.out.println("New format ignores header case: " + newFormat.getIgnoreHeaderCase());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}