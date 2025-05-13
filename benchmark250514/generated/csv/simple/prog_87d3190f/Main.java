import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Create a CSV parser with a sample CSV content
        String csvContent = "# This is a comment\nheader1,header2\nvalue1,value2";
        CSVParser parser = null;
        try {
            parser = CSVParser.parse(new StringReader(csvContent), format);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the comment from the first record
        if (parser != null) {
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
                break; // Ensure the read method is executed only once
            }
        }
    }
}