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
            // Prepare a CSV format with header comments
            CSVFormat format = CSVFormat.DEFAULT
                .withHeaderComments("This is a comment");

            // Simulate CSV content
            String csvContent = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), format);

            // Additional code to make the program more complex
            ArrayList<String> list = new ArrayList<>();
            list.add("First Element");
            list.add("Second Element");
            list.add("Third Element");

            // Iterate over the list and print elements
            for (String element : list) {
                System.out.println("List element: " + element);
            }

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Perform some unrelated calculations
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 natural numbers: " + sum);

            // Read the comment from the record
            /* read */ String comment = record.getComment();
            System.out.println(comment);

            // More unrelated code
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 5);
            }
            for (int number : numbers) {
                System.out.println("Number: " + number);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}