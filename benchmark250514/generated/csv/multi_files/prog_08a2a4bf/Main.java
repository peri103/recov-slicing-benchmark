import org.apache.commons.csv.CSVRecord;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "Name,Age,Country\nJohn,30,USA\nDoe,25,Canada";

            CSVHandler csvHandler = new CSVHandler(csvData);
            DataProcessor dataProcessor = new DataProcessor(csvHandler.getRecordsList());

            dataProcessor.printRecords();
            System.out.println("Total Age: " + dataProcessor.calculateTotalAge());

            CSVRecord firstRecord = csvHandler.getFirstRecord();
            /* read */ boolean isSet = firstRecord.isSet("Name");
            System.out.println("Is 'Name' set in the first record? " + isSet);

            csvHandler.closeParser();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}