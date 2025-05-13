import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name,Age,Location\nJohn,30,New York\n\nJane,25,Los Angeles";

            // Initialize CSVFormat
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true); // /* write */

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Additional unrelated operations
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            ArrayList<String> locations = new ArrayList<>();

            for (CSVRecord rec : parser) {
                if (rec.isSet("Name")) {
                    names.add(rec.get("Name"));
                }
                if (rec.isSet("Age")) {
                    ages.add(Integer.parseInt(rec.get("Age")));
                }
                if (rec.isSet("Location")) {
                    locations.add(rec.get("Location"));
                }
            }

            // Perform some operations on the collected data
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Person: " + names.get(i) + ", Age: " + ages.get(i) + ", Location: " + locations.get(i));
            }

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific column is set
            boolean isSet = record.isSet("Name"); // /* read */

            System.out.println("Is 'Name' column set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}