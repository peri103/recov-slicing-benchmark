import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) {
        try {
            /* write */ this.csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            CSVParser parser = new CSVParser(new StringReader(csvData), this.csvFormat);
            this.records = parser.getRecords();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
