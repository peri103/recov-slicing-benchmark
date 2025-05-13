import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;

public class CSVProcessor {
    private CSVHandler csvHandler;

    public CSVProcessor() {
        csvHandler = new CSVHandler();
    }

    public void processCSV(String csvData) {
        csvHandler.configureFormat();
        try {
            List<CSVRecord> records = csvHandler.parseCSV(csvData);
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                System.out.println("Name: " + name + ", Age: " + age);
                
                /* read */ boolean isMapped = record.isMapped("name");
                System.out.println("Is 'name' mapped: " + isMapped);
                
                int calculatedValue = age * 2;
                System.out.println("Calculated Value: " + calculatedValue);
                
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
