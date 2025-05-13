import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Simulate reading a CSV record with a comment
            String csvData = "# This is a comment\nvalue1,value2,value3";
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Create a list of integers and perform some operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            
            // Use a HashMap to store some data
            HashMap<String, Integer> dataMap = new HashMap<>();
            for (int i = 0; i < numbers.size(); i++) {
                dataMap.put("Key" + i, numbers.get(i));
            }
            
            // Print the elements of the HashMap
            for (String key : dataMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
            }
            
            // Perform some calculations
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);
            
            // Assuming the first record is the comment line
            CSVRecord commentRecord = records.get(0);
            /* read */ String comment = commentRecord.getComment();
            
            // Print the comment
            System.out.println("Comment from CSV: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}