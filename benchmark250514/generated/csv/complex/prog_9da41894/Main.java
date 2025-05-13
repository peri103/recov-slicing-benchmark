import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces();

            // Create a sample CSV content
            String csvContent = "Name, Age, Country\nJohn Doe, 30, USA";

            // Parse the CSV content using the format
            CSVParser parser = new CSVParser(new StringReader(csvContent), format);

            // Get records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Additional operations to increase complexity
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            ArrayList<String> countries = new ArrayList<>();

            for (CSVRecord record : records) {
                if (record.isSet("Name")) {
                    names.add(record.get("Name"));
                }
                if (record.isSet("Age")) {
                    ages.add(Integer.parseInt(record.get("Age")));
                }
                if (record.isSet("Country")) {
                    countries.add(record.get("Country"));
                }
            }

            // Manipulate data
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i));
                System.out.println("Age: " + ages.get(i));
                System.out.println("Country: " + countries.get(i));
            }

            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set: " + isSet);

            // Close the parser
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}