import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn Doe,30\nJane Doe,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional complex logic: Store records in a list
            ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();

            // Process each record
            for (CSVRecord record : parser) {
                HashMap<String, String> recordMap = new HashMap<>();
                recordMap.put("name", record.get("name"));
                recordMap.put("age", record.get("age"));
                recordsList.add(recordMap);

                // Additional logic: Calculate average age
                int totalAge = 0;
                for (HashMap<String, String> rec : recordsList) {
                    totalAge += Integer.parseInt(rec.get("age"));
                }
                double averageAge = totalAge / (double) recordsList.size();
                System.out.println("Average Age: " + averageAge);
            }

            // Further processing and logic
            for (HashMap<String, String> rec : recordsList) {
                System.out.println("Name: " + rec.get("name") + ", Age: " + rec.get("age"));
            }

            // Read the comment from the first record
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }

            // Additional unrelated complex logic: Work with another data structure
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}