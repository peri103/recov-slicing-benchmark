import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class CSVReader {
    private String csvContent;

    public CSVReader(String csvContent) {
        this.csvContent = csvContent;
    }

    public String getComment() throws IOException {
        CSVRecord csvRecord = CSVFormat.DEFAULT.parse(new StringReader(csvContent)).getRecords().get(0);
        /* read */ return csvRecord.getComment();
    }
}
