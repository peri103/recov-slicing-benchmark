import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Prepare CSV data
            String csvData = "name,age\nJohn Doe,30";
            
            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read and print the first record
            if (!records.isEmpty()) {
                /* read */ String recordString = records.get(0).toString();
                System.out.println(recordString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}