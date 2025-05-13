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
            // Initialize CSV format with a specified null string
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withNullString("NULL");

            // Sample CSV data
            String csvData = "id,name,age\n1,John,30\n2,NULL,25\n3,Alice,28";
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Complex data structures
            ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();
            HashMap<String, Integer> nameToAgeMap = new HashMap<>();

            // Process CSV records
            for (CSVRecord record : parser) {
                HashMap<String, String> recordMap = new HashMap<>();
                for (String header : record.toMap().keySet()) {
                    recordMap.put(header, record.get(header));
                }
                recordsList.add(recordMap);

                String name = record.get("name");
                if (name != null && !name.equals("NULL")) {
                    nameToAgeMap.put(name, Integer.parseInt(record.get("age")));
                }

                // Unrelated logic
                if (name != null && name.equals("John")) {
                    System.out.println("Found John!");
                }
            }

            // Further processing with recordsList
            for (HashMap<String, String> recordMap : recordsList) {
                System.out.println("Record: " + recordMap);
            }

            // Check if a specific column is set for the first record
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ boolean isSet = firstRecord.isSet("name");
            System.out.println("Is 'name' set for the first record: " + isSet);

            // Additional logic with nameToAgeMap
            System.out.println("Name to Age Map: " + nameToAgeMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}