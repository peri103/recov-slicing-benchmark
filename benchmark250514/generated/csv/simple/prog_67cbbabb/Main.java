import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format instance with a quote character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
            
            // Sample CSV data
            String csvData = "\"Name\",\"Age\"\n\"John Doe\",\"30\"";
            
            // Parse the CSV data using the format
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = format.parse(reader).getRecords();
            
            // Read the first record and print it
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}