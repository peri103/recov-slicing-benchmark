import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data as a string
        String csvData = "Name, Age, Location\nJohn Doe, 28, USA\nJane Smith, 34, UK";

        CSVHelper csvHelper = new CSVHelper();
        csvHelper.configureFormat();

        try {
            List<CSVRecord> records = csvHelper.parseCSV(csvData);

            RecordProcessor processor = new RecordProcessor(records);
            processor.printRecords();

            double averageAge = processor.calculateAverageAge();
            System.out.println("Average Age: " + averageAge);

            boolean isNameMapped = processor.isNameMappedInFirstRecord();
            System.out.println("Is 'name' mapped in the first record: " + isNameMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}