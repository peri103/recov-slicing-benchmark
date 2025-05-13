import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Sample CSV data with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            
            HashMap<String, String> map = new HashMap<>();
            map.put("key1", "value1");
            map.put("key2", "value2");
            
            for (String key : map.keySet()) {
                System.out.println("Map entry: " + key + " -> " + map.get(key));
            }
            
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
            
            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Output the comment
            System.out.println("CSV Comment: " + comment);
            
            // More complex operations
            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, numbers.get(i) + sum);
            }
            
            for (Integer num : numbers) {
                System.out.println("Modified number: " + num);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}