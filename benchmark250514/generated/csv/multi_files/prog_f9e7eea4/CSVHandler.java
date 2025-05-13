import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws IOException {
        /* write */
        this.format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        this.records = new ArrayList<>();
        for (CSVRecord record : parser) {
            this.records.add(record);
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
