import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

        // Additional unrelated code to make the program more complex
        HashMap<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("John Doe", 30);
        nameAgeMap.put("Jane Doe", 25);

        String csvData = "# This is a comment\nName, Age\nJohn Doe, 30\nJane Doe, 25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Process records to fill nameAgeMap with CSV data
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }

            // Print out the nameAgeMap to show its contents
            for (String name : nameAgeMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Comment from CSV: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // More unrelated code for complexity
        int sumOfAges = 0;
        for (int age : nameAgeMap.values()) {
            sumOfAges += age;
        }
        System.out.println("Sum of ages: " + sumOfAges);
    }
}