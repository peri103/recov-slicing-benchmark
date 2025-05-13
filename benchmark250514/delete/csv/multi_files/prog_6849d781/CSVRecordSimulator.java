import org.apache.commons.csv.CSVRecord;

public class CSVRecordSimulator {
    private CSVRecord record;

    public CSVRecordSimulator(CSVFormatHandler formatHandler) {
        // Simulating a CSVRecord creation
        this.record = new CSVRecord(formatHandler.getFormat(), new String[] {"data1", "data2", "data3"}, 0, 0);
    }

    public boolean checkConsistency() {
        /* read */ return this.record.isConsistent();
    }
}
