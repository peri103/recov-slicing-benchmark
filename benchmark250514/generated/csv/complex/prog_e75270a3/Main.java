import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn Doe,30";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional complex logic
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();
            StringBuilder comments = new StringBuilder();

            for (CSVRecord record : parser) {
                // Collect names and ages
                if (!record.get(0).startsWith("#")) {
                    names.add(record.get("name"));
                    ages.add(Integer.parseInt(record.get("age")));
                }

                // Read the comment from the CSV record
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    comments.append(comment).append("\n");
                }
            }

            // More complex logic to process collected data
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = ages.isEmpty() ? 0 : (double) totalAge / ages.size();

            // Output the results
            System.out.println("Names: " + names);
            System.out.println("Average Age: " + averageAge);
            System.out.println("Comments:\n" + comments.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}