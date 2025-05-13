import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a header comment
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Create a CSV string with a header and a record
        String csvData = "# This is a comment\nName, Age\nJohn Doe, 30";

        // Use a StringReader to simulate reading from a file
        Reader input = new StringReader(csvData);

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(input, format);
            for (CSVRecord record : parser) {
                // Read the comment from the record
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}