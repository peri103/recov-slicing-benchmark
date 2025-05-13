import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Create a sample CSV input with a comment
            String csvData = "#This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a list to hold CSV records
            List<CSVRecord> csvRecords = new ArrayList<>();

            // Retrieve the records and add them to the list
            List<CSVRecord> records = parser.getRecords();
            csvRecords.addAll(records);

            // Create a HashMap to store header-value pairs
            HashMap<String, String> dataMap = new HashMap<>();

            // Populate the HashMap with data from the CSV records
            for (CSVRecord record : csvRecords) {
                for (int i = 0; i < record.size(); i++) {
                    dataMap.put(record.getParser().getHeaderNames().get(i), record.get(i));
                }
            }

            // Perform operations on the HashMap
            for (String key : dataMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
            }

            // Read the comment from the first record
            /* read */ String comment = csvRecords.get(0).getComment();
            System.out.println("Comment: " + comment);

            // Additional operations on the data
            int sum = 0;
            for (String value : dataMap.values()) {
                if (value.matches("\\d+")) {
                    sum += Integer.parseInt(value);
                }
            }
            System.out.println("Sum of numeric values: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}