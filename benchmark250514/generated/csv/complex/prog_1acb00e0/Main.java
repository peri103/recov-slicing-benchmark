import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and add header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Create a sample CSV input
            String csvData = "# This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2\n";
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional code to make the program more complex
            Map<String, Integer> headerCountMap = new HashMap<>();
            for (CSVRecord record : records) {
                for (String header : record.toMap().keySet()) {
                    headerCountMap.put(header, headerCountMap.getOrDefault(header, 0) + 1);
                }
            }

            // Print the header counts
            for (Map.Entry<String, Integer> entry : headerCountMap.entrySet()) {
                System.out.println("Header: " + entry.getKey() + ", Count: " + entry.getValue());
            }

            // Some unrelated logic
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 natural numbers: " + sum);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}