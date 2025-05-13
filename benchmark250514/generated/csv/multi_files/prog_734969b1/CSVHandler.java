import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class CSVHandler {
    private CSVFormat csvFormat;
    private ArrayList<CSVRecord> recordsList;

    public CSVHandler(String csvContent) throws IOException {
        csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withNullString("NULL");
        CSVParser parser = CSVParser.parse(new StringReader(csvContent), csvFormat);
        recordsList = new ArrayList<>(parser.getRecords());
    }

    public ArrayList<CSVRecord> getRecordsList() {
        return recordsList;
    }
}
