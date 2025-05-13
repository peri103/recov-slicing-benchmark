import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withFirstRecordAsHeader();

        // Simulating a CSVRecord for demonstration purposes
        CSVRecord csvRecord = new CSVRecord(null, null, null, 0, 0, null);

        /* read */ boolean isMapped = csvRecord.isMapped("headerName");
        System.out.println(isMapped);
    }
}