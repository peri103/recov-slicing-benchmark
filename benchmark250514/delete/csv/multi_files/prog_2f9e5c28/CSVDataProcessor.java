import org.apache.commons.csv.CSVRecord;

import java.util.HashMap;
import java.util.Map;

public class CSVDataProcessor {
    private CSVRecord record;

    public CSVDataProcessor(CSVConfiguration configuration) {
        Map<String, Integer> headerMap = new HashMap<>();
        headerMap.put("headerName", 1);
        record = new CSVRecord(null, new String[]{"value1"}, headerMap, 0, configuration.getFormat());
    }

    public boolean isHeaderMapped(String headerName) {
        /* read */ return record.isMapped(headerName);
    }
}
