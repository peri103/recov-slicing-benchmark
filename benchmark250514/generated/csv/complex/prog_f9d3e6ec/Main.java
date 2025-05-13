import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with a header
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeader("Name", "Age", "Country");

        // Sample CSV data
        String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,Canada";

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Initialize a list to store names
            ArrayList<String> names = new ArrayList<>();
            Map<String, Integer> ageMap = new HashMap<>();

            // Populate the list and map with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                names.add(name);
                ageMap.put(name, age);
            }

            // Perform some operations on the list and map
            for (String name : names) {
                if (ageMap.containsKey(name)) {
                    System.out.println(name + " is " + ageMap.get(name) + " years old.");
                }
            }

            // Access the first record
            CSVRecord firstRecord = records.get(0);

            // Check if the "Age" column is set for the first record
            /* read */ boolean isSet = firstRecord.isSet("Age");
            System.out.println("Is 'Age' set for the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}