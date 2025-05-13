import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator('\n');

            // Prepare a CSV input string
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize a list to store CSV records
            ArrayList<CSVRecord> recordsList = new ArrayList<>();

            // Iterate through the parsed records and add to the list
            for (CSVRecord record : parser) {
                recordsList.add(record);
            }

            // Initialize a HashMap to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();

            // Populate the HashMap with data from the CSV records
            for (CSVRecord record : recordsList) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the HashMap
            for (String name : nameAgeMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
            }

            // Read the first record from the list
            CSVRecord firstRecord = recordsList.get(0);
            /* read */ String recordString = firstRecord.toString();

            // Output the record
            System.out.println("First Record: " + recordString);

            // Additional operations
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}