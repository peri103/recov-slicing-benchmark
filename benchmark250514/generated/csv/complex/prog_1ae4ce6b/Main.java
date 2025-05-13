import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with a specified delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Prepare a CSV input string
            String csvData = "name;age;city\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";

            // Parse the CSV data using the format with the specified delimiter
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();

            // Process each record to fill the names list and age map
            for (CSVRecord record : records) {
                names.add(record.get(0)); // Assuming the first column is the name
                ageMap.put(record.get(0), Integer.parseInt(record.get(1))); // Assuming the second column is the age
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Perform some operations on the age map
            for (String name : ageMap.keySet()) {
                System.out.println("Age of " + name + " is " + ageMap.get(name));
            }

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();

            // Print the record string
            System.out.println("First record: " + recordString);

            // More complex operations with the records
            for (CSVRecord record : records) {
                System.out.println("Record details: " + record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}