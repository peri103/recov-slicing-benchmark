import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;
import java.io.StringReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific configuration
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Simulate CSV records for demonstration purposes
        ArrayList<CSVRecord> records = new ArrayList<>();
        records.add(new CSVRecord(null, new String[]{"value1", "value2"}, null, 0, 0));
        records.add(new CSVRecord(null, new String[]{"value3", "value4"}, null, 0, 0));

        // Create a map to store some data
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("key1", 100);
        dataMap.put("key2", 200);

        // Iterate over the map and print its contents
        for (String key : dataMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
        }

        // Parse another set of CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";
        try {
            CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(new StringReader(csvData));
            List<CSVRecord> parsedRecords = parser.getRecords();
            for (CSVRecord rec : parsedRecords) {
                System.out.println("Name: " + rec.get("name") + ", Age: " + rec.get("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Assume we are checking if a column is set in the first record
        CSVRecord record = records.get(0);
        /* read */ boolean isSet = record.isSet(0);

        System.out.println("Is the first column set in the first record? " + isSet);

        // Additional logic with lists
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}