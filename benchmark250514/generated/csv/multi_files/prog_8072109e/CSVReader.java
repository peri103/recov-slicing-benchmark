import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class CSVReader {

    public String readFirstRecord(String csvData) throws IOException {
        CSVRecord csvRecord = CSVFormat.DEFAULT.parse(new StringReader(csvData)).getRecords().get(0);
        /* read */ return csvRecord.toString();
    }
}
