import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVUtility {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVUtility(String csvData) throws IOException {
        /* write */ this.format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        this.records = parser.getRecords();
        parser.close();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }

    public CSVFormat getFormat() {
        return format;
    }
}
