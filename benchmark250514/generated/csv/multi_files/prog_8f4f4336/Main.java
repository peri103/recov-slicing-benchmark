import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVFormatWrapper formatWrapper = new CSVFormatWrapper();
            String csvInput = "name,age\nJohn,30\nDoe,25";

            CSVParser parser = CSVParser.parse(csvInput, formatWrapper.getFormat());
            List<CSVRecord> records = parser.getRecords();

            CSVRecordProcessor processor = new CSVRecordProcessor(records);
            processor.printNameAgeMap();

            String firstRecordString = processor.getFirstRecordString();
            System.out.println("First record: " + firstRecordString);

            processor.incrementAge("Doe", 5);
            processor.printUpdatedMap();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}