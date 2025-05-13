import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

public class CSVHandler {
    private CSVFormat format;
    private HashMap<String, CSVRecord> recordMap = new HashMap<>();

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrim();
    }

    public void parseCSVData(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        for (CSVRecord record : parser) {
            String name = record.get("Name");
            recordMap.put(name, record);
        }
    }

    public CSVRecord getRecord(String name) {
        return recordMap.get(name);
    }

    public HashMap<String, CSVRecord> getAllRecords() {
        return recordMap;
    }
}
