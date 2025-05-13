import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Create a HashMap to store CSV data
            Map<String, String> csvMap = new HashMap<>();
            for (CSVRecord rec : records) {
                csvMap.put(rec.get("Header1"), rec.get("Header2"));
            }

            // Use another CSVFormat to add a header
            CSVFormat format2 = CSVFormat.DEFAULT.withHeader("Column1", "Column2");

            // Simulate processing of the CSV data
            for (Map.Entry<String, String> entry : csvMap.entrySet()) {
                System.out.println("Processing: " + entry.getKey() + " -> " + entry.getValue());
            }

            // Perform some unrelated calculations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Output the comment
            System.out.println(comment);

            // Perform additional data manipulation
            Map<String, Integer> numberMap = new HashMap<>();
            for (int i = 1; i <= 5; i++) {
                numberMap.put("Number" + i, i * 10);
            }
            for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
                System.out.println("Entry: " + entry.getKey() + " -> " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}