import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class DataProcessor {
    private CSVHandler csvHandler;

    public DataProcessor() {
        this.csvHandler = new CSVHandler();
    }

    public void processCSVData(String csvData) {
        csvHandler.configureFormat();
        try {
            List<CSVRecord> records = csvHandler.parseCSV(csvData);
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Is the record consistent? " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}