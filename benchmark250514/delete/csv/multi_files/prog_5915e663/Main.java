import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "Name,Age\nJohn Doe,30\nJane Doe,25";
            CSVOperations csvOps = new CSVOperations(csvData);
            DataManager dataManager = new DataManager();

            List<CSVRecord> records = csvOps.getRecords();
            dataManager.processRecords(records);
            dataManager.displayData();

            /* read */ String comment = csvOps.getParser().getHeaderComments().get(0);
            System.out.println(comment);

            csvOps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}