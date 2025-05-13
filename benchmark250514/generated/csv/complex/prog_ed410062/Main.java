import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trim option
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrim();

        // Create a CSVRecord for testing
        String csvData = "name, age, city\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";
        CSVRecord record = null;

        try {
            List<CSVRecord> records = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .parse(new StringReader(csvData))
                    .getRecords();
            if (!records.isEmpty()) {
                record = records.get(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional complex logic
        String[] cities = {"New York", "Los Angeles", "Chicago"};
        List<String> cityList = Arrays.asList(cities);
        String selectedCity = "New York";
        
        if (cityList.contains(selectedCity)) {
            System.out.println(selectedCity + " is in the list.");
        } else {
            System.out.println(selectedCity + " is not in the list.");
        }

        // Ensure the record is not null
        if (record != null) {
            // Additional logic to process CSVRecord
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            System.out.println("Name: " + name + ", Age: " + age);

            // More logic to process data
            if (age > 20) {
                System.out.println(name + " is older than 20.");
            } else {
                System.out.println(name + " is 20 or younger.");
            }

            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);
        }
    }
}