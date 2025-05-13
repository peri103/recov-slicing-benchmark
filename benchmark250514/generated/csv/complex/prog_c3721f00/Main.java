import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Prepare a CSV string with header and data
        String csvData = "Column1,Column2\nData1,Data2";

        // Create a map to store CSV data
        HashMap<String, String> csvMap = new HashMap<>();

        try {
            // Parse the CSV data
            Reader input = new StringReader(csvData);
            CSVParser parser = new CSVParser(input, format);

            // Assume the first record is available for reading
            CSVRecord record = parser.getRecords().get(0);

            // Store data from CSV into the map
            csvMap.put("Column1", record.get("Column1"));
            csvMap.put("Column2", record.get("Column2"));

            // Create a list of keys from the map
            ArrayList<String> keys = new ArrayList<>(csvMap.keySet());

            // Process map and print each key-value pair
            for (String key : keys) {
                System.out.println("Key: " + key + ", Value: " + csvMap.get(key));
            }

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Comment: " + comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional processing of CSV data
        for (String key : csvMap.keySet()) {
            System.out.println("Processing key: " + key);
        }

        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}