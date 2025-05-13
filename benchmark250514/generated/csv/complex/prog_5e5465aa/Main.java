import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional processing: Collect names of all people in the CSV
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.isSet("name")) {
                    names.add(record.get("name"));
                }
            }

            // Unrelated complex operation: Calculate average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : records) {
                if (record.isSet("age")) {
                    totalAge += Integer.parseInt(record.get("age"));
                    count++;
                }
            }
            double averageAge = count > 0 ? (double) totalAge / count : 0;

            // Output the collected names
            System.out.println("Names: " + names);

            // Output the average age
            System.out.println("Average Age: " + averageAge);

            // Read the first record and check if the 'age' field is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isAgeSet = firstRecord.isSet("age");

            // Output the result
            System.out.println("Is 'age' field set in the first record? " + isAgeSet);

            // Further processing: Check for city field in the last record
            CSVRecord lastRecord = records.get(records.size() - 1);
            boolean isCitySet = lastRecord.isSet("city");
            System.out.println("Is 'city' field set in the last record? " + isCitySet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}