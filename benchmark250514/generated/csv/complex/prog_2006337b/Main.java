import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data to parse
        String csvData = "name,age\nJohn,30\nJane,25";
        StringReader stringReader = new StringReader(csvData);

        // Unrelated code to add complexity
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Jane", 25);

        // Iterate over the map and print the ages
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(stringReader).getRecords();

            // Unrelated code to add complexity
            int totalAge = 0;
            for (CSVRecord rec : records) {
                totalAge += Integer.parseInt(rec.get(1)); // Assuming age is at index 1
            }
            System.out.println("Total age of all records: " + totalAge);

            // Assume we are interested in the first record
            CSVRecord record = records.get(0);

            // Check if the record is consistent
            /* read */ boolean isConsistent = record.isConsistent();

            // Output the result
            System.out.println("Is the record consistent? " + isConsistent);

            // More unrelated code to add complexity
            int averageAge = totalAge / records.size();
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}