import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance with a quote character
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        
        // Prepare a CSV input string
        String csvData = "\"Name\",\"Age\"\n\"John Doe\",\"30\"";
        
        // Parse the CSV data using the format
        List<CSVRecord> records = null;
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Assuming records is not null and has at least one record
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        }
    }
}