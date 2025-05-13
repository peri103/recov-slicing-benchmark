import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class CSVProcessor {
    private CSVUtils csvUtils = new CSVUtils();

    public void processCSVData(String csvData) {
        try {
            Iterable<CSVRecord> records = csvUtils.parseCSV(csvData);
            List<String> names = csvUtils.extractColumn(records, "name");
            List<String> cities = csvUtils.extractColumn(records, "city");

            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            for (String city : cities) {
                System.out.println("City: " + city);
            }

            CSVRecord firstRecord = records.iterator().next();
            checkFieldSet(firstRecord, "name");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkFieldSet(CSVRecord record, String fieldName) {
        /* read */ boolean isSet = record.isSet(fieldName);
        System.out.println("Is '" + fieldName + "' field set: " + isSet);
    }
}
