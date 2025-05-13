import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class StudentRecord {
    private ArrayList<CSVRecord> records = new ArrayList<>();
    private CSVFormat format;

    public StudentRecord() {
        this.format = CSVFormat.DEFAULT;
    }

    public void parseCSV(String csvData) {
        try {
            /* write */ format = format.withIgnoreEmptyLines(true);
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            records.addAll(parser.getRecords());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isFirstRecordConsistent() {
        if (!records.isEmpty()) {
            CSVRecord firstRecord = records.get(0);
            /* read */ return firstRecord.isConsistent();
        }
        return false;
    }
}
