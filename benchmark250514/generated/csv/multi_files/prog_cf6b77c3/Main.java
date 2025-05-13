import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVProcessor processor = new CSVProcessor();
            String csvData = "Name,Age\nJohn\\, Doe,30\nJane\\, Smith,25";
            List<CSVRecord> records = processor.parseCSV(csvData);

            DataAnalyzer analyzer = new DataAnalyzer();
            int totalAge = analyzer.calculateTotalAge(records);
            System.out.println("Total Age: " + totalAge);

            String firstRecordString = analyzer.getFirstRecordAsString(records);
            System.out.println("First Record: " + firstRecordString);

            List<String> processedData = processor.processRecords(records);
            for (String data : processedData) {
                System.out.println("Processed: " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}