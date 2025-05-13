import org.apache.commons.csv.CSVRecord;

public class CSVData {
    private CSVRecord csvRecord;

    public CSVData(String[] data) {
        this.csvRecord = new CSVRecord(null, data, null, 0, 0);
    }

    public boolean checkConsistency() {
        /* read */ return csvRecord.isConsistent();
    }
}
