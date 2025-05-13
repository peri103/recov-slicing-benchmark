import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowMissingColumnNames set to true
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Additional processing: Calculate average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord rec : records) {
                if (rec.getRecordNumber() > 1) { // Skip header
                    totalAge += Integer.parseInt(rec.get("age"));
                    count++;
                }
            }
            double averageAge = count > 0 ? (double) totalAge / count : 0;
            System.out.println("Average age: " + averageAge);

            // Read the first record and check its consistency
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            // Additional processing: Print all names
            System.out.println("Names in the CSV:");
            for (CSVRecord rec : records) {
                if (rec.getRecordNumber() > 1) { // Skip header
                    System.out.println(rec.get("name"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}