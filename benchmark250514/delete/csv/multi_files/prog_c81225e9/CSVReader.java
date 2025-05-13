import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;

public class CSVReader {
    private CSVRecord record;

    public CSVReader(String csvContent) throws IOException {
        record = CSVFormat.DEFAULT.parse(csvContent).getRecords().get(0);
    }

    public String readRecord() {
        /* read */ return record.toString();
    }
}
