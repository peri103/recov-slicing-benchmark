import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize an ArrayList to store CSV records
            ArrayList<CSVRecord> recordList = new ArrayList<>();

            // Retrieve the records and add them to the ArrayList
            List<CSVRecord> records = parser.getRecords();
            for (CSVRecord record : records) {
                recordList.add(record);
            }

            // Perform some operations on the records
            HashMap<String, String> recordMap = new HashMap<>();
            for (CSVRecord record : recordList) {
                recordMap.put(record.get(0), record.get(1));
            }

            // Print the map contents
            for (String key : recordMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + recordMap.get(key));
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}