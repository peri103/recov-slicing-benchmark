import java.io.IOException;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            String csvData = "Name, Age, City\nJohn Doe, 29, New York\nJane Smith, 34, Los Angeles";
            csvHandler.parseCSVData(csvData);

            CSVRecord johnRecord = csvHandler.getRecord("John Doe");
            if (johnRecord != null) {
                System.out.println("John's age: " + johnRecord.get("Age"));
            }

            CSVRecord janeRecord = csvHandler.getRecord("Jane Smith");
            if (janeRecord != null) {
                /* read */ boolean isMapped = janeRecord.isMapped("Name");
                System.out.println("Is 'Name' column mapped for Jane? " + isMapped);
            }

            int totalAge = 0;
            for (CSVRecord record : csvHandler.getAllRecords().values()) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Total age of all records: " + totalAge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}