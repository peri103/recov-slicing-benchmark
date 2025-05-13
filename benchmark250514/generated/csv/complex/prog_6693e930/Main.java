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
            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Create sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nAlice,25,UK";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a list to store CSVRecords
            ArrayList<CSVRecord> recordsList = new ArrayList<>();
            recordsList.addAll(parser.getRecords());

            // Create a map to store the age of each person
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : recordsList) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            for (String name : ageMap.keySet()) {
                System.out.println(name + " is " + ageMap.get(name) + " years old.");
            }

            // Get the first record
            CSVRecord record = recordsList.get(0);

            // Check if the header "Age" is set in the record
            /* read */ boolean isAgeSet = record.isSet("Age");

            // Print the result
            System.out.println("Is 'Age' set: " + isAgeSet);

            // Perform additional operations
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age of all persons: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}