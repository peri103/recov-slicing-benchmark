import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');
            
            // Prepare a sample CSV input
            String csvData = "\"Name\",\"Age\"\n\"John Doe\",\"30\"";
            StringReader reader = new StringReader(csvData);
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the first record
            CSVRecord record = records.get(0);
            /* read */ String recordString = record.toString();
            
            // Print the CSV record as a string
            System.out.println(recordString);
            
            // Close the parser
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}