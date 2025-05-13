import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            String csvData = "header1,header2\nvalue1,value2";
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            DataManager dataManager = new DataManager(records);

            // Retrieve and print values from the first column
            List<String> valuesList = dataManager.getFirstColumnValues();
            for (int i = 0; i < valuesList.size(); i++) {
                System.out.println("Value at index " + i + ": " + valuesList.get(i));
            }

            // Retrieve and print the comment from the first record
            String comment = dataManager.getCommentFromRecord(0);
            System.out.println("Comment from CSV: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}