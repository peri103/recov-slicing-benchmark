import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Create a sample CSV input with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Additional complexity: working with ArrayList and HashMap
            ArrayList<String> list = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();
            list.add("Sample");
            map.put("Key1", 100);
            map.put("Key2", 200);

            // Iterate over the records to find the comment
            Iterator<CSVRecord> iterator = records.iterator();
            CSVRecord record = null;
            while (iterator.hasNext()) {
                record = iterator.next();
                if (record.getComment() != null) {
                    break;
                }
            }

            // Perform some operations on the list and map
            for (String item : list) {
                System.out.println("List item: " + item);
            }
            for (String key : map.keySet()) {
                System.out.println("Map value for " + key + ": " + map.get(key));
            }

            // Read the comment from the record
            /* read */ String comment = record != null ? record.getComment() : null;

            // Print the comment
            System.out.println("CSV Comment: " + comment);

            // More operations to increase complexity
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numberList.add(i * 10);
            }
            for (int number : numberList) {
                System.out.println("Number: " + number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}