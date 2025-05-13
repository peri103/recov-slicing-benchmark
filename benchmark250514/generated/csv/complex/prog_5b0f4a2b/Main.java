import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with header comments
            CSVFormat format = CSVFormat.DEFAULT
                    /* write */ .withHeaderComments("This is a comment");

            // Simulate a CSV input to parse
            String csvData = "# This is a comment\nHeader1,Header2\nvalue1,value2";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Additional code to increase complexity
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Extra Data 1");
            dataList.add("Extra Data 2");

            // Process additional data
            for (String data : dataList) {
                System.out.println("Processing: " + data);
            }

            // Read the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // More complex data manipulation
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            /* read */ String comment = record.getComment();
            System.out.println(comment);

            // Further operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 2);
            }

            for (Integer number : numbers) {
                System.out.println("Number: " + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}