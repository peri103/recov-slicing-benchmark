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
            // Initialize CSVFormat with escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');

            // Prepare a sample CSV string
            String csvData = "Name,Age\nJohn Doe,30\nJane Doe,25";

            // Parse the CSV string using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            ArrayList<HashMap<String, String>> recordList = new ArrayList<>();
            for (CSVRecord record : records) {
                HashMap<String, String> recordMap = new HashMap<>();
                recordMap.put("Name", record.get(0));
                recordMap.put("Age", record.get(1));
                recordList.add(recordMap);
            }

            // Perform some operations on the list of maps
            for (HashMap<String, String> recordMap : recordList) {
                if (Integer.parseInt(recordMap.get("Age")) > 28) {
                    System.out.println("Older than 28: " + recordMap.get("Name"));
                }
            }

            // Read the first record and convert to string
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

            // More operations on records
            for (CSVRecord record : records) {
                System.out.println("Name: " + record.get(0) + ", Age: " + record.get(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}