import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHelper {
    private CSVFormat format;
    
    public CSVHelper() {
        // Create a CSVFormat instance with ignore surrounding spaces
        /* write */ format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
    }
    
    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();
        parser.close();
        return records;
    }
}
