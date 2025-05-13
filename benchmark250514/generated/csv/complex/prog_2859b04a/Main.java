import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Create a sample CSV data with a comment
            String csvData = "#This is a comment\nname,age\nJohn,30\nDoe,25";

            // Parse the CSV data
            CSVParser parser = format.parse(new java.io.StringReader(csvData));
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            HashMap<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                if (!record.getComment().equals("#This is a comment")) {
                    String name = record.get(0);
                    int age = Integer.parseInt(record.get(1));
                    nameToAgeMap.put(name, age);
                }
            }

            // Manipulate the map
            ArrayList<String> names = new ArrayList<>(nameToAgeMap.keySet());
            for (String name : names) {
                if (nameToAgeMap.get(name) > 28) {
                    System.out.println(name + " is older than 28.");
                }
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);

            // Further operations with the map
            int sumOfAges = 0;
            for (int age : nameToAgeMap.values()) {
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}