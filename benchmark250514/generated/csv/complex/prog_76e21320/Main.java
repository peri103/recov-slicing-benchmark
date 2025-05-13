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
            // Prepare CSV content
            String csvContent = "# This is a comment\n" +
                                "header1,header2\n" +
                                "value1,value2\n";
            
            // Create CSVFormat with header comments
            CSVFormat csvFormat = CSVFormat.DEFAULT
                                    /* write */ .withHeaderComments("This is a comment");
            
            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), csvFormat);
            List<CSVRecord> records = parser.getRecords();
            
            // Complex operations with unrelated logic
            ArrayList<String> dataList = new ArrayList<>();
            for (CSVRecord record : records) {
                StringBuilder sb = new StringBuilder();
                for (String value : record) {
                    sb.append(value).append(" ");
                }
                dataList.add(sb.toString().trim());
            }

            // Further processing of dataList
            for (int i = 0; i < dataList.size(); i++) {
                String data = dataList.get(i);
                System.out.println("Processed data: " + data);
            }

            // Additional logic to simulate complexity
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 integers: " + sum);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Output the comment
            System.out.println("Comment from CSV: " + comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}