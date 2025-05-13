import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;

public class RecordAnalyzer {
    private ArrayList<CSVRecord> recordsList;

    public RecordAnalyzer(ArrayList<CSVRecord> recordsList) {
        this.recordsList = recordsList;
    }

    public boolean isAgeSetInFirstRecord() {
        CSVRecord record = recordsList.get(0);
        /* read */ return record.isSet("age");
    }

    public void printRecords() {
        for (CSVRecord rec : recordsList) {
            System.out.println("Record: " + rec);
        }
    }
}
