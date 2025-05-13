import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();
            
            // Unrelated code: Create a list of names from the CSV data
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                if (!record.hasComment()) {
                    names.add(record.get(0)); // Add name to the list
                }
            }

            // Process names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Unrelated code: Calculate the average age from the CSV data
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : records) {
                if (!record.hasComment()) {
                    totalAge += Integer.parseInt(record.get(1)); // Add age to total
                    count++;
                }
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average age: " + averageAge);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println("Comment from CSV: " + comment);

            // Unrelated code: Check if a specific name exists in the list
            String searchName = "Jane";
            if (names.contains(searchName)) {
                System.out.println(searchName + " is in the list.");
            } else {
                System.out.println(searchName + " is not in the list.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}