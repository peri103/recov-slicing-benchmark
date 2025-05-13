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
            // Step 1: Create a CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Step 2: Prepare a CSV string to parse (simulating the write operation)
            String csvData = "# This is a header comment\n" + 
                             "header1,header2\n" +
                             "value1,value2\n";

            // Step 3: Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional complexity: Working with an ArrayList
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Initial Data");
            dataList.add("More Data");

            // Perform some operations on the list
            for (int i = 0; i < dataList.size(); i++) {
                System.out.println("Data at index " + i + ": " + dataList.get(i));
            }

            // Manipulate the list further
            dataList.add("Final Data");
            dataList.remove(0);

            // Step 4: Read the comment from the first record (simulating the read operation)
            List<CSVRecord> records = parser.getRecords();
            /* read */ String comment = records.get(0).getComment();

            // More operations after reading
            int totalLength = 0;
            for (String data : dataList) {
                totalLength += data.length();
            }
            System.out.println("Total length of data in list: " + totalLength);

            // Step 5: Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}