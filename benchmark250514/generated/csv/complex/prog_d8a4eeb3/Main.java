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
            // Initialize CSVFormat with trim option
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Prepare a sample CSV input
            String csvData = "Name, Age, Location\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();

            // Additional logic to process multiple records
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("Name"));
            }

            // Process names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Check if a header is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);

            // More complex operations with CSV data
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            double averageAge = totalAge / (double) records.size();
            System.out.println("Average age: " + averageAge);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}