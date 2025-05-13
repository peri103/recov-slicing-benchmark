import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class CSVData {
    private CSVRecord record;

    public CSVData(CSVFormat csvFormat) {
        List<String> headers = Arrays.asList("Name", "Age", "Country");
        List<String> values = Arrays.asList("Alice", "30", "USA");
        this.record = new CSVRecord(null, values.toArray(new String[0]), headers.toArray(new String[0]), 0, 0);
    }

    public boolean checkMapping(String header) {
        /* read */ return record.isMapped(header);
    }

    public void printRecord() {
        List<String> headers = Arrays.asList("Name", "Age", "Country");
        for (String header : headers) {
            System.out.println("Header: " + header + ", Value: " + record.get(header));
        }
    }
}
