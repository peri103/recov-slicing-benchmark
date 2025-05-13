import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a setting to allow missing column names
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames();
        
        // Simulate a CSVRecord for demonstration purposes
        // Note: In practice, CSVRecord would be obtained from parsing a CSV file
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(format, values, null, 0, 0);

        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        
        // Create a HashMap and populate it with some data
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);
        
        // Perform operations on the list and map
        list.add("Element3");
        map.put("Key3", 300);
        
        // Iterate over the list and print elements
        for (String element : list) {
            System.out.println(element);
        }
        
        // Iterate over the map and print key-value pairs
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Check if a specific index is set in the record
        /* read */ boolean isSet = record.isSet(0);
        System.out.println(isSet);

        // Further operations on the list and map
        list.remove("Element2");
        map.remove("Key1");
        
        // Print the updated list and map
        System.out.println("Updated List: " + list);
        System.out.println("Updated Map: " + map);
    }
}