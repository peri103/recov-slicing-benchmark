import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Define a sample CSV input with comments
        String csvData = "# This is a comment\n" +
                         "name,age\n" +
                         "John,30\n" +
                         "# Another comment\n" +
                         "Jane,25";

        // Initialize CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Create a list to store names
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                // Skip comment records
                if (record.getComment() != null) continue;
                names.add(record.get("name"));
            }

            // Perform some operations on names
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Calculate the average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : records) {
                if (record.getComment() != null) continue;
                totalAge += Integer.parseInt(record.get("age"));
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Comment: " + comment);

            // Perform additional operations
            int maxAge = Integer.MIN_VALUE;
            for (CSVRecord record : records) {
                if (record.getComment() != null) continue;
                int age = Integer.parseInt(record.get("age"));
                if (age > maxAge) {
                    maxAge = age;
                }
            }
            System.out.println("Max Age: " + maxAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}