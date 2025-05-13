import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it to ignore empty lines
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Create a sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\n\nJane,25,Los Angeles";

            // Parse the CSV data using the configured format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create a list to hold names and a map for age and city
            List<String> names = new ArrayList<>();
            Map<String, String> ageCityMap = new HashMap<>();

            // Iterate over the records and process each record
            for (CSVRecord record : parser) {
                if (record.isSet("name")) {
                    names.add(record.get("name"));
                }
                if (record.isSet("age") && record.isSet("city")) {
                    ageCityMap.put(record.get("age"), record.get("city"));
                }
            }

            // Close the parser
            parser.close();

            // Process the names list
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Process the age-city map
            for (Map.Entry<String, String> entry : ageCityMap.entrySet()) {
                System.out.println("Age: " + entry.getKey() + ", City: " + entry.getValue());
            }

            // Dummy unrelated operations to increase complexity
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // A nested loop to add complexity
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Nested Loop [" + i + "," + j + "]");
                }
            }

            // Check if the first CSV record has the 'name' field set
            /* read */ boolean isNameSet = parser.getRecords().get(0).isSet("name");
            System.out.println("Is 'name' set in the first record: " + isNameSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}