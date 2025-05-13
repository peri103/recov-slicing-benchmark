import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

        // Sample CSV data with a comment
        String csvData = "# This is a comment\n" +
                         "header1,header2\n" +
                         "value1,value2";

        // Parse the CSV data
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

        // Additional code to increase complexity
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Sample1");
        dataList.add("Sample2");
        dataList.add("Sample3");

        for (String data : dataList) {
            System.out.println("Processing: " + data);
        }

        // More operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Assuming the first record is a comment, read the comment
        /* read */ String comment = records.get(0).getComment();

        // Further operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);

        // Output the comment
        System.out.println(comment);
    }
}