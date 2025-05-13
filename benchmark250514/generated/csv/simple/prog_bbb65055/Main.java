import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) throws Exception {
        // Prepare CSV data
        String csvData = "name,age\nJohn,30\nJane,25";
        
        // Create a CSVFormat instance and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withFirstRecordAsHeader();
        
        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();
        
        // Read the first record
        CSVRecord firstRecord = records.get(0);
        /* read */ boolean isMapped = firstRecord.isMapped("name");
        
        // Output the result
        System.out.println(isMapped);
    }
}