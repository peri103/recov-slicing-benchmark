import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,San Francisco";
            
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Parse the CSV data
            Reader in = new StringReader(csvData);
            CSVParser parser = new CSVParser(in, format);
            List<CSVRecord> records = parser.getRecords();

            // Read the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}