import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

        try {
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Additional complexity: Using HashMap to store data
            HashMap<String, Integer> dataMap = new HashMap<>();
            dataMap.put("John Doe", 30);
            dataMap.put("Jane Doe", 25);

            ArrayList<String> namesList = new ArrayList<>();
            namesList.add("John Doe");
            namesList.add("Jane Doe");

            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Additional operations with CSVRecord
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                System.out.println("Name: " + name + ", Age: " + age);

                // Use data from HashMap
                if (dataMap.containsKey(name)) {
                    System.out.println("DataMap Age: " + dataMap.get(name));
                }

                // Use data from ArrayList
                if (namesList.contains(name)) {
                    System.out.println("NamesList contains: " + name);
                }

                // Break to ensure original read is executed only once
                break;
            }

            // More complex operations
            for (String name : namesList) {
                System.out.println("Processing: " + name);
            }

            /* read */
            boolean isSet = parser.iterator().next().isSet("name");
            System.out.println("Is 'name' set: " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}