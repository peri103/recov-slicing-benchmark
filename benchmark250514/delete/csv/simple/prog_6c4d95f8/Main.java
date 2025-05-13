import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat object with the first record as header
        CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();

        // Simulate writing by creating a list of CSVRecords
        List<CSVRecord> records = new ArrayList<>();
        CSVRecord record = new CSVRecord(null, null, csvFormat);
        records.add(record);

        // Simulate reading by checking if the record is mapped
        /* read */ boolean isMapped = record.isMapped("someHeader");
        System.out.println(isMapped);
    }
}