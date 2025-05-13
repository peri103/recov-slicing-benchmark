import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\nDoe,40";
        
        try {
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withFirstRecordAsHeader();
            
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();
            
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("name");
            
            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}