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
            // Initialize CSV format with a null string setting
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Create a CSV parser with the format and some sample data
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Initialize a list to store CSV records
            List<CSVRecord> records = new ArrayList<>();

            // Add records to the list
            for (CSVRecord record : parser) {
                records.add(record);
            }

            // Perform some operations on the records
            int totalAge = 0;
            for (CSVRecord record : records) {
                String ageStr = record.get("age");
                if (!"NULL".equals(ageStr)) {
                    totalAge += Integer.parseInt(ageStr);
                }
            }
            System.out.println("Total age excluding NULL values: " + totalAge);

            // Retrieve the first record
            CSVRecord firstRecord = records.get(0);

            // Perform unrelated operations
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("name"));
            }
            System.out.println("Names from the CSV: " + names);

            // Check if a specific column is set
            /* read */ boolean isSet = firstRecord.isSet("age");
            System.out.println("Is 'age' set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}