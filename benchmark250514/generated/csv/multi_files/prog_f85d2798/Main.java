import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.addRecord("John", "Doe", "john.doe@example.com");

            List<CSVRecord> records = csvHandler.getRecords();
            CSVRecord record = records.get(0);
            /* read */ String email = record.get(2);

            System.out.println("Email: " + email);

            for (CSVRecord rec : records) {
                System.out.println("Full Record: " + rec.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
