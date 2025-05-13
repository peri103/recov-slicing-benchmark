import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String csvData = "name,age\nJohn,30\nDoe,40";
        
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader(); /* write */
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
        
        CSVRecord record = records.get(0);
        boolean isMapped = record.isMapped("name"); /* read */
        
        System.out.println(isMapped);
    }
}