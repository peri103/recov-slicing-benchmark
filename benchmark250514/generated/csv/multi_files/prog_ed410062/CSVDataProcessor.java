import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVDataProcessor {
    private CSVRecord record;

    public void parseCSVData(String csvData, CSVConfiguration config) {
        try {
            List<CSVRecord> records = config.getFormat()
                    .withFirstRecordAsHeader()
                    .parse(new StringReader(csvData))
                    .getRecords();
            if (!records.isEmpty()) {
                record = records.get(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isNameMapped() {
        if (record != null) {
            /* read */ return record.isMapped("name");
        }
        return false;
    }

    public String getName() {
        return record != null ? record.get("name") : null;
    }

    public int getAge() {
        return record != null ? Integer.parseInt(record.get("age")) : -1;
    }
}
