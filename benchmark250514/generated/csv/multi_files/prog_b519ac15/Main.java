import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "Name, Age, City\nJohn Doe, 29, New York\n\nJane Doe, 25, Los Angeles";
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.parseCSV(csvData);

            List<CSVRecord> records = csvHandler.getRecords();
            DataProcessor dataProcessor = new DataProcessor(records);

            Map<String, Integer> nameToAgeMap = dataProcessor.mapNameToAge();
            double averageAge = dataProcessor.calculateAverageAge(nameToAgeMap);
            System.out.println("Average Age: " + averageAge);

            for (CSVRecord record : records) {
                /* read */ boolean isSet = record.isSet("Name");
                System.out.println("Is 'Name' set: " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}