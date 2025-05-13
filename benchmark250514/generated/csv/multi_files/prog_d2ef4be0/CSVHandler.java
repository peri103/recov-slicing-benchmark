import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVHandler {
    private CSVFormat format;
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<String, Integer> ageMap = new HashMap<>();

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ format = format.withRecordSeparator(';');
    }

    public void parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        for (CSVRecord record : parser) {
            names.add(record.get(0));
            ageMap.put(record.get(0), Integer.parseInt(record.get(1)));
        }
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public HashMap<String, Integer> getAgeMap() {
        return ageMap;
    }
}
