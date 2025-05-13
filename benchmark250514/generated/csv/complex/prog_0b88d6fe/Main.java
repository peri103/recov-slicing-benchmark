import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional processing on CSV records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.isSet("Name")) {
                    names.add(record.get("Name"));
                }
            }

            // Do some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Access a record and check if a column is set
            CSVRecord firstRecord = records.get(0);
            // Some unrelated code to make the program more complex
            int totalAge = 0;
            for (CSVRecord record : records) {
                if (record.isSet("Age")) {
                    totalAge += Integer.parseInt(record.get("Age"));
                }
            }
            System.out.println("Total age: " + totalAge);

            /* read */ boolean isSet = firstRecord.isSet("Name");
            System.out.println("Is 'Name' column set in the first record? " + isSet);

            // More complex operations
            ArrayList<Integer> ages = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.isSet("Age")) {
                    ages.add(Integer.parseInt(record.get("Age")));
                }
            }
            for (int age : ages) {
                System.out.println("Age: " + age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}