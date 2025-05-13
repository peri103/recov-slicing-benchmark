import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using CSVPrinter
            /* write */ printer.printComment("This is a comment");
            printer.flush();  // Ensure the data is written to the writer
            
            // Simulate complex operations before reading the comment
            ArrayList<String> list = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < 5; i++) {
                list.add("Item" + i);
                map.put("Key" + i, i * 10);
            }
            
            for (String item : list) {
                System.out.println(item);
            }
            
            int sum = 0;
            for (Integer value : map.values()) {
                sum += value;
            }
            System.out.println("Sum of values in map: " + sum);

            // Create a StringReader from the written CSV data
            Reader reader = new StringReader(writer.toString());
            
            // Parse the CSV data using CSVFormat with comments enabled
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
            
            // Read the comment from the CSVRecord
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}