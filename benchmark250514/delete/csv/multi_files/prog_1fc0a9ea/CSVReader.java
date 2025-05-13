import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.Iterator;

public class CSVReader {
    private Iterable<CSVRecord> records;

    public CSVReader(Iterable<CSVRecord> records) {
        this.records = records;
    }

    public boolean isFirstRecordNameSet() {
        Iterator<CSVRecord> iterator = records.iterator();
        if (iterator.hasNext()) {
            CSVRecord record = iterator.next();
            // Check if the 'name' column is set
            /* read */ return record.isSet("name");
        }
        return false;
    }
}
