import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "name,age\nAlice,30\nBob,25";
            StringReader reader = new StringReader(csvData);

            // Create CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');

            // Parse CSV data
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Read from CSVRecord
            /* read */ String recordString = records.get(0).toString();

            // Output the result
            System.out.println(recordString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}