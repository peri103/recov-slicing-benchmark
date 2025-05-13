import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,USA";
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        try {
            /* write */ csvFormat = csvFormat.withFirstRecordAsHeader();
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            CSVRecord record = parser.getRecords().get(0);
            
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println(isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}