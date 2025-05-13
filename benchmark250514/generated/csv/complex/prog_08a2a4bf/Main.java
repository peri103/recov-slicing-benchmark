import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare the CSV format with a header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nDoe,25,Canada";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Unrelated complex code
            ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();
            for (CSVRecord csvRecord : parser) {
                HashMap<String, String> recordMap = new HashMap<>();
                for (String header : csvRecord.toMap().keySet()) {
                    recordMap.put(header, csvRecord.get(header));
                }
                recordsList.add(recordMap);
            }

            // Process the recordsList
            for (HashMap<String, String> record : recordsList) {
                for (String key : record.keySet()) {
                    System.out.println(key + ": " + record.get(key));
                }
            }

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // More unrelated complex code
            int totalAge = 0;
            for (HashMap<String, String> rec : recordsList) {
                totalAge += Integer.parseInt(rec.get("Age"));
            }
            System.out.println("Total Age: " + totalAge);

            // Check if a certain header is set
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}