import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing missing column names
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        // Additional data structures for complexity
        ArrayList<String> names = new ArrayList<>();
        Map<String, Integer> ageMap = new HashMap<>();

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Iterate over records
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                
                // Populate additional data structures
                names.add(name);
                ageMap.put(name, age);
            }

            // Perform some operations with additional data structures
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Check if the record is consistent
            /* read */ boolean isConsistent = firstRecord.isConsistent();

            System.out.println("Is the first record consistent? " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional complex operations
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Processing: " + names.get(i));
        }
        
        System.out.println("Total names processed: " + names.size());
    }
}