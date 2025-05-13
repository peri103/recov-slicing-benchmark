import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

        // Create a sample CSV input
        String csvData = "name,age\nJohn Doe,30\nJane Doe,25";

        // Parse the CSV data
        Reader in = new StringReader(csvData);
        CSVParser parser = new CSVParser(in, format);

        // Retrieve the records
        List<CSVRecord> records = parser.getRecords();

        // Access the comment from the first record
        if (!records.isEmpty()) {
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);
        }
    }
}