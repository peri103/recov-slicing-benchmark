import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access a CSVRecord
            CSVRecord record = records.get(0);

            // Additional logic to make the program more complex
            List<String> names = new ArrayList<>();
            for (CSVRecord rec : records) {
                if (rec.isSet("name")) {
                    names.add(rec.get("name"));
                }
            }

            // Process names and ages
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Assume some complex logic here
            int totalAge = 0;
            for (CSVRecord rec : records) {
                if (rec.isSet("age")) {
                    totalAge += Integer.parseInt(rec.get("age"));
                }
            }
            System.out.println("Total age: " + totalAge);

            // Check if a column is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' column set? " + isSet);

            // More complex logic
            int averageAge = totalAge / records.size();
            System.out.println("Average age: " + averageAge);

            // Additional unrelated logic
            List<Integer> ages = new ArrayList<>();
            for (CSVRecord rec : records) {
                if (rec.isSet("age")) {
                    ages.add(Integer.parseInt(rec.get("age")));
                }
            }

            for (int age : ages) {
                System.out.println("Age: " + age);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}