import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "Name,Age\nJohn Doe,30\nJane Doe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(reader, format);

            // Create a list to store names
            ArrayList<String> names = new ArrayList<>();
            // Create a map to store ages
            HashMap<String, Integer> ages = new HashMap<>();

            // Iterate over records to populate names and ages
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                names.add(name);
                ages.put(name, age);
            }

            // Perform some operations on names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Perform some operations on ages
            for (String name : ages.keySet()) {
                int age = ages.get(name);
                System.out.println(name + " is " + age + " years old.");
            }

            // Read the first record and get the comment
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = parser.getHeaderComments().get(0);

            // Print the comment
            System.out.println(comment);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}