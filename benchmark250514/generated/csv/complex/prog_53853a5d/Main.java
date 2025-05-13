import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Simulate reading a CSV record
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = csvFormat.parse(reader).getRecords();
            
            // Additional complex logic
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numberList.add(i * 2);
            }

            int sum = 0;
            for (int num : numberList) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                
                // More complex operations
                ArrayList<String> stringList = new ArrayList<>();
                stringList.add("Hello");
                stringList.add("World");
                
                StringBuilder concatenatedString = new StringBuilder();
                for (String str : stringList) {
                    concatenatedString.append(str).append(" ");
                }
                System.out.println("Concatenated String: " + concatenatedString.toString().trim());
                
                // Read the comment from the CSVRecord
                /* read */ String comment = record.getComment();
                System.out.println("CSV Comment: " + comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}