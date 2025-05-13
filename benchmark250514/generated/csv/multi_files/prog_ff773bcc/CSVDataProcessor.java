import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class CSVDataProcessor {
    private CSVConfiguration csvConfiguration;
    private Map<String, Integer> nameToAge = new HashMap<>();

    public CSVDataProcessor(CSVConfiguration csvConfiguration) {
        this.csvConfiguration = csvConfiguration;
        initializeData();
    }

    private void initializeData() {
        nameToAge.put("John", 30);
        nameToAge.put("Jane", null);
    }

    public void parseCSVData(String csvData) {
        try (Reader in = new StringReader(csvData);
             CSVParser parser = new CSVParser(in, csvConfiguration.getFormat())) {

            // Get the first record
            CSVRecord record = parser.getRecords().get(1);

            // Simulate some unrelated complex logic
            int processedAge = 0;
            for (CSVRecord rec : parser) {
                String ageStr = rec.get("Age");
                if (!"NULL".equals(ageStr)) {
                    processedAge += Integer.parseInt(ageStr);
                }
            }
            System.out.println("Processed age sum: " + processedAge);

            // Check if the "Age" column is mapped
            /* read */ boolean isMapped = record.isMapped("Age");

            // Print the result
            System.out.println("Is 'Age' column mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addPerson(String name, Integer age) {
        nameToAge.put(name, age);
    }

    public int getSumOfAges() {
        int sum = 0;
        for (Integer age : nameToAge.values()) {
            if (age != null) {
                sum += age;
            }
        }
        return sum;
    }
}
