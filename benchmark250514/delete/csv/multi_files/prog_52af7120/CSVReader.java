import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.ArrayList;

public class CSVReader {
    private CSVProcessor csvProcessor;

    public CSVReader(CSVProcessor csvProcessor) {
        this.csvProcessor = csvProcessor;
    }

    public void checkColumnSet(CSVRecord record) {
        /* read */ boolean isSet = record.isSet("Name");
        System.out.println("Is 'Name' column set? " + isSet);
    }

    public void printData() {
        HashMap<String, ArrayList<String>> dataMap = csvProcessor.getDataMap();
        for (String city : dataMap.keySet()) {
            System.out.println("People in " + city + ": " + dataMap.get(city));
        }
    }
}