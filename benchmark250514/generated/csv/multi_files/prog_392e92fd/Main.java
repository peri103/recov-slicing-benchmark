import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            RecordAnalyzer analyzer = new RecordAnalyzer();

            String csvData = "name,age,city\nJohn,30,NULL\nDoe,NULL,New York";
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            for (CSVRecord record : records) {
                String name = record.get("name");
                String city = analyzer.getCity(record);
                System.out.println(name + " lives in " + city);
            }

            CSVRecord firstRecord = records.get(0);
            boolean isAgeSet = analyzer.isAgeSet(firstRecord);
            System.out.println("Is 'age' field set in the first record? " + isAgeSet);

            // Additional unrelated operations
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to 10: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}