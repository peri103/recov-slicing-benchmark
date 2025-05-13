import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configureFormat(); // Configure the CSV format

        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";
        CSVDataProcessor processor = new CSVDataProcessor();

        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvConfig.getFormat());
            for (CSVRecord record : parser) {
                processor.processRecord(record);
            }

            processor.printData();

            // Use the read method to check if the first record is consistent
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ boolean isConsistent = firstRecord.isConsistent();
            System.out.println("First record is consistent: " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }

        int totalAge = processor.getTotalAge();
        System.out.println("Total age of all entries: " + totalAge);
    }
}