import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSV data
        String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

        // Create CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();

        // Unrelated complex logic
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 1);
        dataMap.put("B", 2);
        dataMap.put("C", 3);

        for (String key : dataMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
        }

        // More unrelated logic
        int sum = 0;
        for (CSVRecord record : records) {
            for (String value : record) {
                sum += value.length();
            }
        }
        System.out.println("Total length of all values: " + sum);

        // Read the comment from the first record
        /* read */ String comment = records.get(0).getComment();
        System.out.println("Comment: " + comment);

        // Additional logic to make it more complex
        String[] headers = {"header1", "header2"};
        for (String header : headers) {
            System.out.println("Header: " + header);
        }

        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
    }
}