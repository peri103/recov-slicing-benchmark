import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Prepare a CSV string with header and data
        String csvData = "Column1,Column2\nData1,Data2";

        try {
            // Parse the CSV data
            Reader input = new StringReader(csvData);
            CSVParser parser = new CSVParser(input, format);

            // Assume the first record is available for reading
            CSVRecord record = parser.getRecords().get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}