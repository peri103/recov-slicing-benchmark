import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.ArrayList;

public class CSVProcessor {
    private CSVFormat csvFormat;
    private HashMap<String, ArrayList<String>> dataMap;

    public CSVProcessor() {
        csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();
        dataMap = new HashMap<>();
    }

    public void parseCSV(String csvData) {
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                String age = record.get("Age");
                String city = record.get("City");

                if (!dataMap.containsKey(city)) {
                    dataMap.put(city, new ArrayList<>());
                }
                dataMap.get(city).add(name + " (" + age + ")");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, ArrayList<String>> getDataMap() {
        return dataMap;
    }
}