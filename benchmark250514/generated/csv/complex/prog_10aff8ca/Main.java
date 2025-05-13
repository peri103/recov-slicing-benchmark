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
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a header comment");

            // Create a CSV string to parse
            String csvData = "header1,header2\nvalue1,value2\n";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional processing with CSVParser
            List<CSVRecord> records = parser.getRecords();
            ArrayList<String> values = new ArrayList<>();
            for (CSVRecord record : records) {
                values.add(record.get(0));
            }

            // Perform some unrelated operations
            int sum = 0;
            for (String value : values) {
                sum += value.length();
            }
            System.out.println("Sum of lengths: " + sum);

            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);

            // More unrelated operations
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