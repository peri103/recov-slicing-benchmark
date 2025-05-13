import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVReader {
    public String readFirstRecord(String data) throws IOException {
        CSVRecord record = CSVFormat.DEFAULT.parse(new StringReader(data)).getRecords().get(0);
        return record.toString(); /* read */
    }
}
