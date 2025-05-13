import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "# This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional complexity: working with an ArrayList
            ArrayList<String> list = new ArrayList<>();
            list.add("First Element");
            list.add("Second Element");
            list.add("Third Element");

            // Process the list
            for (String element : list) {
                System.out.println("Processing: " + element);
            }

            // Get the first record
            CSVRecord record = parser.iterator().next();

            // Additional complexity: manipulate the record
            String value1 = record.get("header1");
            String value2 = record.get("header2");
            System.out.println("CSV Values: " + value1 + ", " + value2);

            // Read the comment from the record
            /* read */ String comment = record.getComment();
            System.out.println(comment);

            // More complexity: calculate sum of lengths of list elements
            int totalLength = 0;
            for (String element : list) {
                totalLength += element.length();
            }
            System.out.println("Total length of list elements: " + totalLength);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}