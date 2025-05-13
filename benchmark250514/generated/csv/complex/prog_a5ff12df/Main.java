import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create an ArrayList and add some elements
            ArrayList<String> list = new ArrayList<>();
            list.add("Element1");
            list.add("Element2");

            // Perform some operations on the list
            for (String element : list) {
                System.out.println("Processing: " + element);
            }

            // Use a loop to interact with CSV records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
                // Extract data from each record
                String value1 = record.get("header1");
                String value2 = record.get("header2");
                System.out.println("Values: " + value1 + ", " + value2);
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);

            // Additional complex operations on the list
            list.add("Element3");
            list.remove(0);
            list.set(0, "UpdatedElement2");

            // Print final list state
            System.out.println("Final List: " + list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}