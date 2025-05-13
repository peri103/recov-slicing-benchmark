import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;
import java.io.StringReader;
import java.io.IOException;

public class CSVReader {
    private CSVRecord record;

    public void parseData(String data, CSVFormat format) throws IOException {
        Iterable<CSVRecord> records = format.parse(new StringReader(data));
        this.record = records.iterator().next();
    }

    public boolean isHeaderMapped(String header) {
        /* read */ return record.isMapped(header);
    }

    public CSVRecord getRecord() {
        return record;
    }
}
