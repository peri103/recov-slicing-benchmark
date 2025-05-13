import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVDataParser {
    private List<CSVRecord> records;
    private HashMap<String, Integer> ageMap = new HashMap<>();

    public CSVDataParser(CSVFormat csvFormat, String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
        records = parser.getRecords();
        parseData();
    }

    private void parseData() {
        for (CSVRecord rec : records) {
            String name = rec.get(0).trim();
            int age = Integer.parseInt(rec.get(1).trim());
            ageMap.put(name, age);
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }

    public HashMap<String, Integer> getAgeMap() {
        return ageMap;
    }
}
