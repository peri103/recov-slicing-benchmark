import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nAlice,30,New York\nBob,25,Los Angeles";

            // Create a CSVFormat instance with the first record as header
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Unrelated code: Create a list and add some elements
            List<String> names = new ArrayList<>();
            names.add("Charlie");
            names.add("Dave");

            // Process each record in the CSV
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                String location = record.get("Location");

                // Unrelated code: Add name to the list if age is above 20
                if (age > 20) {
                    names.add(name);
                }

                System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);
            }

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Unrelated code: Print all names in the list
            System.out.println("Names in the list:");
            for (String n : names) {
                System.out.println(n);
            }

            // Check if a field is mapped
            /* read */ boolean isMapped = firstRecord.isMapped("Name");

            System.out.println("Is 'Name' field mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}