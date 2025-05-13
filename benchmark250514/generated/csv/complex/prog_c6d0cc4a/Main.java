import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);
            
            // Initialize CSVFormat
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Additional complexity: processing records
            ArrayList<String> values = new ArrayList<>();
            for (CSVRecord rec : records) {
                for (int i = 0; i < rec.size(); i++) {
                    values.add(rec.get(i));
                }
            }
            
            // Simulate some complex operations
            int sum = 0;
            for (String value : values) {
                if (value.matches("\\d+")) {
                    sum += Integer.parseInt(value);
                }
            }
            System.out.println("Sum of numeric values: " + sum);
            
            // Assuming the comment is attached to the first record
            CSVRecord record = records.get(0);
            
            // More operations
            int count = 0;
            for (String value : values) {
                if (value.startsWith("value")) {
                    count++;
                }
            }
            System.out.println("Count of 'value' entries: " + count);
            
            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println(comment);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}