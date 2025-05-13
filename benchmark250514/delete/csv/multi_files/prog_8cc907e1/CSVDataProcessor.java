import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataProcessor {
    private List<CSVRecord> records = new ArrayList<>();

    public void parseCSV(String csvData, CSVFormat format) {
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isColumnSet(int recordIndex, int columnIndex) {
        if (recordIndex < records.size()) {
            /* read */ return records.get(recordIndex).isSet(columnIndex);
        }
        return false;
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
