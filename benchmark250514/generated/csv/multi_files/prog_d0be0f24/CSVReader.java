import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class CSVReader {
    private String csvData;

    public CSVReader(String csvData) {
        this.csvData = csvData;
    }

    public String readData() throws IOException {
        CSVRecord record = CSVFormat.DEFAULT.parse(new StringReader(csvData)).iterator().next();
        /* read */ return record.toString();
    }
}