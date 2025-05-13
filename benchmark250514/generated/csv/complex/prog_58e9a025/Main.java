import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSV format with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name, Age, Country\nJohn Doe, 29, USA\nJane Doe, 27, UK";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get all records
            ArrayList<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Unrelated complex logic
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some calculations
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // More unrelated operations
            ArrayList<String> countries = new ArrayList<>();
            for (CSVRecord rec : records) {
                String country = rec.get("Country");
                if (!countries.contains(country)) {
                    countries.add(country);
                }
            }
            System.out.println("Countries: " + countries);

            // Get the first record
            CSVRecord record = records.get(0);

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}