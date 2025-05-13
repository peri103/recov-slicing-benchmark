import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat and configure it using the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        // Sample CSV data
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

        // Additional unrelated code to make the program more complex
        ArrayList<String> names = new ArrayList<>();
        HashMap<String, Integer> ageMap = new HashMap<>();

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Extract data and populate collections
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1).trim());
                names.add(name);
                ageMap.put(name, age);
            }

            // Process data further
            for (String name : names) {
                System.out.println("Processing: " + name);
                Integer age = ageMap.get(name);
                if (age != null) {
                    System.out.println(name + " is " + age + " years old.");
                }
            }

            // Use the read method to check if the record is consistent
            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // More unrelated code to increase complexity
        int totalAge = 0;
        for (Integer age : ageMap.values()) {
            totalAge += age;
        }
        System.out.println("Total age of all entries: " + totalAge);
    }
}