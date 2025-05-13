import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class CSVReader {
    private List<CSVRecord> records;

    public CSVReader(String csvContent) throws IOException {
        CSVParser parser = CSVParser.parse(csvContent, CSVFormat.DEFAULT);
        records = parser.getRecords();
    }

    public String readFirstName() {
        CSVRecord record = records.get(0);
        /* read */ return record.get(0);
    }
}
