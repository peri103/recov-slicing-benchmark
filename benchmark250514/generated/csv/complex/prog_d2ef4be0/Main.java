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
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(';');

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,New York;Jane,25,Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional complex logic: Using ArrayList and HashMap
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : parser) {
                names.add(record.get(0));
                ageMap.put(record.get(0), Integer.parseInt(record.get(1)));
            }

            // Perform operations on ArrayList and HashMap
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Read the first record
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ String output = firstRecord.toString();

            // Output the record
            System.out.println("First Record: " + output);

            // Additional complex logic: Calculate average age
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}