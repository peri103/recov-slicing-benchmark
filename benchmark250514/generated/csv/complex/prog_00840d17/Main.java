import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Additional CSVFormat with different configuration
            CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(';').withIgnoreEmptyLines();

            // Create a sample CSV content
            String csvContent = "Name, Age\nAlice, 30\nBob, 25";
            String csvContent2 = "Product; Price\nLaptop; 1000\nPhone; 500";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(csvContent, format);
            CSVParser parser2 = CSVParser.parse(csvContent2, format2);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();
            List<CSVRecord> records2 = parser2.getRecords();

            // Perform some operations on the second set of records
            for (CSVRecord record : records2) {
                String product = record.get(0);
                String price = record.get(1);
                System.out.println("Product: " + product + ", Price: " + price);
            }

            // Additional logic using ArrayList
            ArrayList<String> commentsList = new ArrayList<>();
            commentsList.add("First comment");
            commentsList.add("Second comment");

            for (String comment : commentsList) {
                System.out.println("Comment: " + comment);
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}