import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            
            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Perform operations on records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
            }

            // Configure the format further
            /* write */ format = format.withIgnoreHeaderCase();

            // Get the first record
            CSVRecord record = records.get(0);

            // Perform additional operations on records
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                System.out.println("Name: " + name + ", Age: " + age);
            }

            // Check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' column mapped? " + isMapped);

            // Further manipulation of records
            for (CSVRecord rec : records) {
                if (rec.isMapped("Age")) {
                    System.out.println("Age column is mapped for: " + rec.get("Name"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}