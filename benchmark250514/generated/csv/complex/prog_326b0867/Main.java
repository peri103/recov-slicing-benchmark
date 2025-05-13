import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\n\nDoe,25,Los Angeles";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Additional code: create a map to store ages of people
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : records) {
                if (rec.isSet("name") && rec.isSet("age")) {
                    ageMap.put(rec.get("name"), Integer.parseInt(rec.get("age")));
                }
            }

            // Output the map contents
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            // Read the first record and check if a column is set using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' column set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}