import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Prepare CSV data
        String csvData = "name,age\nJohn,30\n\nJane,25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional processing
            int totalAge = 0;
            for (CSVRecord rec : records) {
                if (rec.isSet("age")) {
                    totalAge += Integer.parseInt(rec.get("age"));
                }
            }

            // Read the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record? " + isSet);
            System.out.println("Total age of all records: " + totalAge);

            // More complex operations
            int count = 0;
            for (CSVRecord rec : records) {
                if (rec.isSet("name")) {
                    count++;
                }
            }
            System.out.println("Number of records with 'name' set: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}