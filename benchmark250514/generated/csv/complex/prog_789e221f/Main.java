import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "name,age\nJohn,30\nDoe,\nAlice,25\nBob,NULL\n";

            // Create CSVFormat with a specific null string
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional CSV operations
            ArrayList<String> namesList = new ArrayList<>();
            for (CSVRecord rec : records) {
                String name = rec.get("name");
                namesList.add(name);
                System.out.println("Name: " + name);
            }

            // Complex processing
            int totalAge = 0;
            for (CSVRecord rec : records) {
                if (rec.isSet("age")) {
                    totalAge += Integer.parseInt(rec.get("age"));
                }
            }
            System.out.println("Total Age: " + totalAge);

            // Read from the record
            CSVRecord record = records.get(1); // Access the second record (Doe,)
            boolean isSet = /* read */ record.isSet("age"); // Check if 'age' column is set

            System.out.println("Is 'age' set for Doe: " + isSet);

            // Further operations
            for (String name : namesList) {
                if (name.startsWith("A")) {
                    System.out.println("Name starting with A: " + name);
                }
            }

            // Additional calculations
            int averageAge = totalAge / records.size();
            System.out.println("Average Age: " + averageAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}