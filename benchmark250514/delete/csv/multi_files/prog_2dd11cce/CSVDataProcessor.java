import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CSVDataProcessor {
    private CSVRecord record;

    public CSVDataProcessor(List<String> data, CSVUtils csvUtils) {
        record = csvUtils.getFormat().parse(data).iterator().next();
    }

    public boolean checkIsSet(int index) {
        /* read */ return record.isSet(index);
    }
}
