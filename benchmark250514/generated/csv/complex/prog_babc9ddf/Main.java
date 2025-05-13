import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with ignoring empty lines
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nDoe,25\n";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get records
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated operations
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();

            // Loop through records to populate names and ages
            for (CSVRecord rec : records) {
                if (rec.isSet("name")) {
                    names.add(rec.get("name"));
                }
                if (rec.isSet("age")) {
                    ages.add(Integer.parseInt(rec.get("age")));
                }
            }

            // Perform some calculations
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();

            // Read a specific record
            CSVRecord record = records.get(0); // Getting the first record

            // More unrelated operations
            System.out.println("Names: " + names);
            System.out.println("Ages: " + ages);
            System.out.println("Average Age: " + averageAge);

            // Check if a field is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' field set? " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}