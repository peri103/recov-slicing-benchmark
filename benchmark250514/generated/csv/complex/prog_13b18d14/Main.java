import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with ignoring header case
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Create a sample CSVRecord list for demonstration
            List<CSVRecord> records = format.parse(new java.io.StringReader("Header1,Header2\nvalue1,value2")).getRecords();
            
            // Unrelated code to make the program more complex
            ArrayList<String> sampleList = new ArrayList<>();
            sampleList.add("Sample1");
            sampleList.add("Sample2");

            HashMap<String, Integer> sampleMap = new HashMap<>();
            sampleMap.put("Key1", 100);
            sampleMap.put("Key2", 200);

            for (String item : sampleList) {
                System.out.println("List item: " + item);
            }

            for (String key : sampleMap.keySet()) {
                System.out.println("Map key: " + key + ", value: " + sampleMap.get(key));
            }

            // Continue with CSV parsing logic
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                
                // Additional unrelated logic
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Sum of first 10 natural numbers: " + sum);

                // Check if a field is mapped
                /* read */ boolean isMapped = record.isMapped("HEADER1");
                System.out.println("Is 'HEADER1' mapped: " + isMapped);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}