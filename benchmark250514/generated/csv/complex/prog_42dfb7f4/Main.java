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
                /* write */ .withHeaderComments("This is a comment");

            // Prepare a CSV string to parse
            String csvData = "Column1,Column2\nValue1,Value2";

            // Parse the CSV data using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Additional complexity: Process records and store values in an ArrayList
            ArrayList<String> column1Values = new ArrayList<>();
            for (CSVRecord record : records) {
                column1Values.add(record.get(0));
            }

            // Further processing: Calculate the length of each value in Column1
            ArrayList<Integer> lengths = new ArrayList<>();
            for (String value : column1Values) {
                lengths.add(value.length());
            }

            // Output the lengths
            System.out.println("Lengths of values in Column1:");
            for (Integer length : lengths) {
                System.out.println(length);
            }

            // Assuming we want to read the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println("Comment from CSVRecord: " + comment);
            }

            // More complexity: Reverse the values in Column1
            ArrayList<String> reversedValues = new ArrayList<>();
            for (String value : column1Values) {
                reversedValues.add(new StringBuilder(value).reverse().toString());
            }

            // Output the reversed values
            System.out.println("Reversed values in Column1:");
            for (String reversedValue : reversedValues) {
                System.out.println(reversedValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}