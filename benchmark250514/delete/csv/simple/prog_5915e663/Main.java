import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "Name,Age\nJohn Doe,30\nJane Doe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(reader, format);

            // Read the first record and get the comment
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = parser.getHeaderComments().get(0);

            // Print the comment
            System.out.println(comment);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}