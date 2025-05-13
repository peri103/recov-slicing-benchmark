import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

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

            // Step 4: Read the comment from the first record (simulating the read operation)
            List<CSVRecord> records = parser.getRecords();
            /* read */ String comment = records.get(0).getComment();

            // Step 5: Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}