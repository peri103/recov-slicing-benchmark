import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
        
        // Create a CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Parse the CSV data
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
                break; // Ensure the read operation is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}