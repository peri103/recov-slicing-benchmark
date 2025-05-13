import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Simulating a CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, new String[]{"value1", "NULL", "value3"}, null, null);

        // Create a HashMap to store CSV field names and their values
        Map<String, String> csvData = new HashMap<>();
        csvData.put("field1", "value1");
        csvData.put("field2", "NULL");
        csvData.put("field3", "value3");

        // Iterate over the map and print out the values
        for (Map.Entry<String, String> entry : csvData.entrySet()) {
            System.out.println("Field: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Add some logic to manipulate the map
        if (!csvData.containsKey("field4")) {
            csvData.put("field4", "value4");
        }

        // Check if a specific field is set in the CSVRecord
        /* read */ boolean isSet = record.isSet("value1");
        System.out.println("Is 'value1' set in the record? " + isSet);

        // Further manipulate the map and print updated values
        csvData.put("field2", "updatedValue");
        for (Map.Entry<String, String> entry : csvData.entrySet()) {
            System.out.println("Updated Field: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}