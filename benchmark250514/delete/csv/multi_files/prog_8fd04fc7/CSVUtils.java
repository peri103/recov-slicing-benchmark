import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class CSVUtils {
    private CSVFormat format;
    private Map<String, Integer> nameToAgeMap;

    public CSVUtils() {
        format = CSVFormat.DEFAULT;
        nameToAgeMap = new HashMap<>();
    }

    public void initializeFormat() {
        /* write */ format = format.withTrim();
    }

    public void parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        for (CSVRecord record : parser) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            nameToAgeMap.put(name, age);
        }
    }

    public Map<String, Integer> getNameToAgeMap() {
        return nameToAgeMap;
    }

    public CSVRecord getFirstRecord(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        return parser.getRecords().get(0);
    }
}
