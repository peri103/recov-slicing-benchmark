import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat format = CSVFormat.DEFAULT;
    private List<CSVRecord> records = new ArrayList<>();

    public void configureFormat() {
        /* write */ format = format.withDelimiter(';');
    }

    public void parseCSV(String csvData) {
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
