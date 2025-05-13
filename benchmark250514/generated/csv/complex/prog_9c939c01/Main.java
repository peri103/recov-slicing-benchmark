import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trimming spaces
        CSVFormat format = CSVFormat.DEFAULT.withTrim(); /* write */

        // Sample CSV data
        String csvData = "name,age\nJohn Doe,25\nJane Smith,30";

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create a list to store names from the CSV records
            ArrayList<String> namesList = new ArrayList<>();

            // Iterate through records and collect names
            for (CSVRecord record : records) {
                if (record.isMapped("name")) {
                    namesList.add(record.get("name"));
                }
            }

            // Perform some operations with the namesList
            for (String name : namesList) {
                System.out.println("Processing name: " + name);
            }

            // Read the first record and check if a specific field is mapped
            CSVRecord firstRecord = records.get(0);
            boolean isMapped = firstRecord.isMapped("name"); /* read */

            // Output the result
            System.out.println("Is 'name' field mapped in the first record? " + isMapped);

            // Further processing with namesList
            namesList.add("New Name");
            System.out.println("Updated names list: " + namesList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}