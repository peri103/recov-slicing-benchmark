import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withNullString("NULL");

            // Prepare a CSV content to parse
            String csvContent = "name,age\nJohn,NULL\nDoe,25";
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), csvFormat);

            // Introduce additional complexity with a HashMap
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            nameAgeMap.put("Alice", 30);
            nameAgeMap.put("Bob", 40);

            // Use ArrayList to store CSV records
            ArrayList<CSVRecord> recordsList = new ArrayList<>(parser.getRecords());

            // Get the first record
            CSVRecord record = recordsList.get(0);

            // Additional operations with the HashMap
            for (String name : nameAgeMap.keySet()) {
                System.out.println(name + " is " + nameAgeMap.get(name) + " years old.");
            }

            // Check if a column in the record is set
            /* read */ boolean isSet = record.isSet("age");
            System.out.println("Is 'age' set in the first record? " + isSet);

            // Further operations with ArrayList
            for (CSVRecord rec : recordsList) {
                System.out.println("Record: " + rec);
            }

            // Adding more complexity with nested loops
            for (int i = 0; i < recordsList.size(); i++) {
                for (int j = 0; j < nameAgeMap.size(); j++) {
                    System.out.println("Processing record " + i + " with map entry " + j);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}