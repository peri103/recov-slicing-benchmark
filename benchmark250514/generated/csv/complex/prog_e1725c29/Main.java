import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with the comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        // Sample CSV data with a comment
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();

        // Additional complexity: Using a HashMap to store header-value pairs
        HashMap<String, String> dataMap = new HashMap<>();
        for (CSVRecord record : records) {
            if (!record.hasComment()) {
                for (int i = 0; i < record.size(); i++) {
                    dataMap.put("header" + (i + 1), record.get(i));
                }
            }
        }

        // Process and print the data from the map
        for (String key : dataMap.keySet()) {
            System.out.println(key + ": " + dataMap.get(key));
        }

        // Read the comment from the first record
        /* read */ String comment = records.get(0).getComment();
        System.out.println("Comment: " + comment);

        // More complexity: Perform some calculations on the data
        int sum = 0;
        for (String value : dataMap.values()) {
            if (value.matches("\\d+")) {
                sum += Integer.parseInt(value);
            }
        }
        System.out.println("Sum of numeric values: " + sum);
    }
}