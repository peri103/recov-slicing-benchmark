import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "Name,Age,Location\nAlice,30,New York\nBob,25,Los Angeles";
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withFirstRecordAsHeader();

            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}