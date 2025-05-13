import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Get the first record
            CSVRecord record = records.get(0);

            // Check if a header is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println(isMapped);

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}