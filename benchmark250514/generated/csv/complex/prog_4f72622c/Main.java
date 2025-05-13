import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Prepare a sample CSV content
            String csvContent = "name, age\nJohn Doe, 30\nJane Smith, 25";
            StringReader reader = new StringReader(csvContent);

            // Parse the CSV content
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();

            // Additional code to process CSV records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.isMapped("name")) {
                    names.add(record.get("name"));
                }
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Use the read method to check if a column is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("name");

            // Output the result
            System.out.println("Is 'name' column mapped in first record? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}