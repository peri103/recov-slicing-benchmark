import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "# This is a comment\nName, Age\nJohn, 30\nDoe, 25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Unrelated code to add complexity: working with an ArrayList
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            // Process records and add names to the ArrayList
            for (CSVRecord record : records) {
                String name = record.get(0);
                if (!name.startsWith("#")) {
                    names.add(name);
                }
            }

            // Manipulate the ArrayList
            names.remove("Alice");
            names.add("David");
            names.add("Eve");

            // Iterate over the ArrayList and print names
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Comment: " + comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}