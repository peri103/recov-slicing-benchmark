import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class CSVProcessor {
    private CSVFormat format;

    public CSVProcessor() {
        format = CSVFormat.DEFAULT;
        /* write */ format = format.withEscape('\\');
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData)).getRecords();
    }

    public List<String> processRecords(List<CSVRecord> records) {
        List<String> processedData = new ArrayList<>();
        for (CSVRecord record : records) {
            processedData.add(record.toString());
        }
        return processedData;
    }
}
