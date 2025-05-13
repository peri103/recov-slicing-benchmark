import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Configure CSV format
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configureFormat();

        // Create a CSVRecord using the configured format
        CSVRecord record = new CSVRecord(null, null, null, csvConfig.getFormat());

        // Validate the CSVRecord
        CSVRecordValidator validator = new CSVRecordValidator(record);
        boolean isMapped = validator.isRecordMapped();
        boolean isValid = validator.isRecordValid();

        // Simulated data processing
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("John, Doe, 30");
        dataList.add("Jane, Smith, 25");

        for (String data : dataList) {
            String[] splitData = data.split(",");
            System.out.println("Name: " + splitData[0].trim() + " " + splitData[1].trim() + ", Age: " + splitData[2].trim());
        }

        // Print validation results
        System.out.println("Is the record mapped? " + isMapped);
        System.out.println("Is the record valid? " + isValid);
    }
}