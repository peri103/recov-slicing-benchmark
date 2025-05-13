import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat with trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT /* write */.withTrailingDelimiter();

        // Sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

        try {
            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Create a list to store CSVRecord objects
            List<CSVRecord> recordList = new ArrayList<>();
            for (CSVRecord record : records) {
                recordList.add(record);
            }

            // Process records and calculate average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : recordList) {
                totalAge += Integer.parseInt(record.get("age"));
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average age: " + averageAge);

            // Assume we want to check if the 'city' column is set for the first record
            CSVRecord firstRecord = recordList.get(0);
            boolean isCitySet = /* read */ firstRecord.isSet("city");

            // Output the result
            System.out.println("Is 'city' column set for the first record? " + isCitySet);

            // Further processing: Print names of people living in New York
            System.out.println("People living in New York:");
            for (CSVRecord record : recordList) {
                if ("New York".equals(record.get("city"))) {
                    System.out.println(record.get("name"));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}