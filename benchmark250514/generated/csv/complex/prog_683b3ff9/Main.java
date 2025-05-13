import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data with header comments
            String csvData = "# This is a header comment\nHeader1,Header2\nValue1,Value2";
            
            // Create CSVFormat instance with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");
            
            // Create an ArrayList to store CSV records
            ArrayList<CSVRecord> csvRecords = new ArrayList<>();
            
            // Parse the CSV data and add records to the list
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            for (CSVRecord record : records) {
                csvRecords.add(record);
            }

            // Perform some operations on the records
            for (CSVRecord record : csvRecords) {
                System.out.println("Record: " + record);
                for (String value : record) {
                    System.out.println("Value: " + value);
                }
            }

            // Calculate the sum of values in the second column (assuming they are integers)
            int sum = 0;
            for (CSVRecord record : csvRecords) {
                try {
                    sum += Integer.parseInt(record.get(1));
                } catch (NumberFormatException e) {
                    System.out.println("Non-integer value encountered: " + record.get(1));
                }
            }
            System.out.println("Sum of second column: " + sum);

            // Read the comment from the first record (header comment)
            /* read */ String comment = csvRecords.get(0).getComment();
            
            System.out.println("Header Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}