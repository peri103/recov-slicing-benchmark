import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and use the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Prepare a sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional complex logic: Process CSV records into a list of names
            List<String> names = new ArrayList<>();
            for (CSVRecord rec : parser) {
                if (rec.isSet("name")) {
                    names.add(rec.get("name"));
                }
            }

            // More complex logic: Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
                // Simulate some complex processing
                if (name.contains("Doe")) {
                    System.out.println(name + " is a Doe family member.");
                }
            }

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method
            /* read */ boolean isSet = record.isSet("name");

            // Print the result
            System.out.println("Is 'name' set in the first record? " + isSet);

            // Additional logic: Use the names list after the read operation
            System.out.println("Total names processed: " + names.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}