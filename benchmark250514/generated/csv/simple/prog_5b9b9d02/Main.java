import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
        
        // Sample CSV data
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
        
        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        
        // Assume we have at least one record
        List<CSVRecord> records = parser.getRecords();
        CSVRecord record = records.get(0);
        
        /* read */ String comment = record.getComment(); // This should read the header comment
        
        System.out.println(comment);
    }
}