import org.apache.commons.csv.CSVRecord;

public class CSVData {
    private CSVRecord record;

    public CSVData(CSVRecord record) {
        this.record = record;
    }

    public boolean isFieldMapped(String fieldName) {
        /* read */ return record.isMapped(fieldName);
    }

    public String getField(String fieldName) {
        return record.get(fieldName);
    }
}
