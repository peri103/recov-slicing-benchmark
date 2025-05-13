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

            // Prepare a CSV input string
            String csvData = "header1,header2\nvalue1,value2";

            // Parse the CSV data using the format with header comments
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Additional code to make the program more complex
            // Using ArrayList to store CSV values
            ArrayList<String> valuesList = new ArrayList<>();
            for (CSVRecord rec : records) {
                valuesList.add(rec.get(0)); // Assuming the first column is of interest
            }

            // Perform some operations on the valuesList
            for (int i = 0; i < valuesList.size(); i++) {
                System.out.println("Value at index " + i + ": " + valuesList.get(i));
            }

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Comment from CSV: " + comment);

            // Additional operations
            // Manipulating the valuesList
            valuesList.add("new_value");
            System.out.println("Updated List: " + valuesList);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}