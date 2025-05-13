import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignoring header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, format);

        // Additional complex code
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Data1");
        dataList.add("Data2");

        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Key1", 100);
        dataMap.put("Key2", 200);

        for (String data : dataList) {
            System.out.println("Processing: " + data);
            if (dataMap.containsKey(data)) {
                System.out.println("Found in map: " + dataMap.get(data));
            }
        }

        // Adding more complexity with nested loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Nested Loop i: " + i + ", j: " + j);
            }
        }

        // Check if the record is mapped
        /* read */ boolean isMapped = record.isMapped();
        System.out.println("Is record mapped: " + isMapped);

        // Further operations with data structures
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(i * 10);
        }

        for (int num : intList) {
            System.out.println("Number: " + num);
        }
    }
}