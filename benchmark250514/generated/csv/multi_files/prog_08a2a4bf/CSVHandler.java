import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVHandler {
    private CSVFormat format;
    private CSVParser parser;
    private ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();

    public CSVHandler(String csvData) throws IOException {
        /* write */ format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
        parser = new CSVParser(new StringReader(csvData), format);
        parseRecords();
    }

    private void parseRecords() throws IOException {
        for (CSVRecord csvRecord : parser) {
            HashMap<String, String> recordMap = new HashMap<>();
            for (String header : csvRecord.toMap().keySet()) {
                recordMap.put(header, csvRecord.get(header));
            }
            recordsList.add(recordMap);
        }
    }

    public ArrayList<HashMap<String, String>> getRecordsList() {
        return recordsList;
    }

    public CSVRecord getFirstRecord() throws IOException {
        return parser.getRecords().get(0);
    }

    public void closeParser() throws IOException {
        parser.close();
    }
}
