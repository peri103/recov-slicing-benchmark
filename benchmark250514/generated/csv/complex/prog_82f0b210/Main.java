import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a CSVFormat object with an escape character
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withEscape('\\');

            // Prepare a sample CSV input
            String csvData = "name,age\\,location\nJohn Doe,30\\,New York";

            // Parse the CSV data using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Create a list to store CSVRecords
            ArrayList<CSVRecord> recordsList = new ArrayList<>();

            // Add records to the list
            for (CSVRecord record : parser) {
                recordsList.add(record);
            }

            // Create a map to store additional information
            HashMap<String, String> infoMap = new HashMap<>();
            infoMap.put("description", "Sample CSV data processing");

            // Process and print each record
            for (CSVRecord record : recordsList) {
                System.out.println("Processing record: " + record.toString());
            }

            // Assume we want to read the first record
            CSVRecord firstRecord = recordsList.get(0);

            // Read the record as a string
            /* read */ String recordString = firstRecord.toString();

            // Output the read string
            System.out.println("First record string: " + recordString);

            // Further processing with the infoMap
            for (String key : infoMap.keySet()) {
                System.out.println("Info: " + key + " = " + infoMap.get(key));
            }

            // Additional complex operations
            int sumAge = 0;
            for (CSVRecord record : recordsList) {
                String ageStr = record.get(1).replace("\\,", "");
                sumAge += Integer.parseInt(ageStr);
            }
            System.out.println("Total age: " + sumAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}