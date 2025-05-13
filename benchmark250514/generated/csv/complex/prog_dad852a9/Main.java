import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with trimming
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 25\nJane Smith, 30";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create a list to store names from the CSV
            List<String> names = new ArrayList<>();

            // Iterate over each record and extract names
            for (CSVRecord record : parser) {
                if (record.isMapped("name")) {
                    names.add(record.get("name"));
                }
            }

            // Process the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Read the first record
            CSVRecord firstRecord = parser.iterator().next();

            // Check if a specific column is mapped
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' column mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}