import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class CSVDataHandler {
    private CSVFormat format;
    private Map<String, Integer> nameAgeMap = new HashMap<>();

    public CSVDataHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void initializeFormat() {
        /* write */ format = format.withHeaderComments("This is a comment");
    }

    public void parseCSVData(String csvData) {
        Reader input = new StringReader(csvData);
        try {
            CSVParser parser = new CSVParser(input, format);

            for (CSVRecord record : parser) {
                // Extract and store data in the map
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> getNameAgeMap() {
        return nameAgeMap;
    }
}
